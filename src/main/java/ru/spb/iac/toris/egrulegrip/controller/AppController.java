package ru.spb.iac.toris.egrulegrip.controller;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.spb.iac.toris.egrulegrip.parser.IMainParser;
import ru.spb.iac.toris.egrulegrip.utils.Util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/rest/api")
public class AppController {

    private static final String SUCCESS_STATUS = "success";
    private static final String ERROR_STATUS = "error";
    private static final int CODE_SUCCESS = 100;
    private static final int AUTH_FAILURE = 102;

    @Autowired
    private IMainParser mainParser;

    @GetMapping("/egrul_egrip/upload")
    public BaseResponse uploadData() {
        mainParser.parse();
        return new BaseResponse(SUCCESS_STATUS, CODE_SUCCESS);
    }

    @PostMapping("/egrul_egrip/upload/file")
    public ResponseEntity<String> uploadDataFile(@RequestParam("file") MultipartFile file) throws IOException {
        File convFile = null;
        try{
            convFile = Util.convert(file);
            mainParser.parseFile(convFile);
        } catch (IOException e) {
            System.out.println("Error parsing file");
            System.out.println(e.getMessage());
        }finally{
            if(convFile!=null) {
                convFile.delete();
            }
        }
        return (new ResponseEntity<>("Successful", null, HttpStatus.OK));
    }

    @PostMapping("/egrul_egrip/upload/dir")
    public ResponseEntity<String> uploadDataDir(@RequestParam("files") List<MultipartFile> files) throws IOException {
        //Object files="files";
        File[] convFiles = null;
        try{
            convFiles = new File[files.size()];
            int i =0;
            for (MultipartFile file : files) {
                convFiles[i]=Util.convert(file);
                ++i;
               //byte[] bytes = file.getBytes();
                //System.out.println("File Name: " + file.getOriginalFilename());
                //System.out.println("File Content:\n" + new String(bytes));
            }
            mainParser.parse(convFiles);
        } catch (IOException e) {
            System.out.println("Error while parsing");
            System.out.println(e.getMessage());
            return (new ResponseEntity<>("Error", null, HttpStatus.INTERNAL_SERVER_ERROR));
        } finally {
            if (convFiles != null) {
                for (File tmp : convFiles) {
                    tmp.delete();
                }
            }
        }
        return (new ResponseEntity<>("Successful", null, HttpStatus.OK));
    }
    @PostMapping("/egrul_egrip/upload/zip")
    public ResponseEntity<String> uploadDataZip(@RequestParam("zipFile") MultipartFile file) throws IOException {
        File zip = File.createTempFile(UUID.randomUUID().toString(), "temp");
        FileOutputStream os = new FileOutputStream(zip);
        IOUtils.copy(file.getInputStream(), os);
        ZipFile zipFile;
        String dest = "zipFiles";
        try{
            zipFile = new ZipFile(zip);
            zipFile.extractAll(dest);
            mainParser.parse(new File(dest));
        } catch (ZipException e) {
            System.out.println("Error while parsing");
            System.out.println(e.getMessage());
            return (new ResponseEntity<>("Error", null, HttpStatus.INTERNAL_SERVER_ERROR));
        }finally {
            if (zip != null) zip.delete();
            Util.deleteDirectory(new File(dest));
        }
        return (new ResponseEntity<>("Successful", null, HttpStatus.OK));
    }

//    public File convert(MultipartFile file) throws  IOException{
//        String fileName = file.getOriginalFilename();
//        File convFile = new File(fileName.substring(fileName.lastIndexOf("/")+1));
//        convFile.createNewFile();
//        FileOutputStream fos = new FileOutputStream(convFile);
//        fos.write(file.getBytes());
//        fos.close();
//        return convFile;
//    }
//    void deleteDirectory(File directoryToBeDeleted) {
//        File[] allContents = directoryToBeDeleted.listFiles();
//        if (allContents != null) {
//            for (File file : allContents) {
//                deleteDirectory(file);
//            }
//        }
//        directoryToBeDeleted.delete();
//    }
}
