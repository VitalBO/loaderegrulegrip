package ru.spb.iac.toris.egrulegrip.parser

import ru.spb.iac.toris.egrulegrip.controller.AppController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Narrative
import spock.lang.Specification
import spock.lang.Title

@Title("Application Specification")
@Narrative("Specification which beans are expected")
@SpringBootTest
class LoadContextTest extends Specification {

    @Autowired(required = false)
    private AppController appController


    def "when context is loaded then all expected beans are created"() {
        expect: "the AppController is created"
        appController
    }
}