SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', true);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- DROP TABLES IF EXISTS
--

DROP TABLE IF EXISTS public."CN" CASCADE;
DROP TABLE IF EXISTS public."CT" CASCADE;
DROP TABLE IF EXISTS public."DS" CASCADE;
DROP TABLE IF EXISTS public."FL" CASCADE;
DROP TABLE IF EXISTS public."FLDOLGN" CASCADE;
DROP TABLE IF EXISTS public."FLUCHR" CASCADE;
DROP TABLE IF EXISTS public."GOSREG" CASCADE;
DROP TABLE IF EXISTS public."IP" CASCADE;
DROP TABLE IF EXISTS public."IPCITIZEN" CASCADE;
DROP TABLE IF EXISTS public."IPDOKDSN" CASCADE;
DROP TABLE IF EXISTS public."IPFOMS" CASCADE;
DROP TABLE IF EXISTS public."IPFSS" CASCADE;
DROP TABLE IF EXISTS public."IPGOSREG" CASCADE;
DROP TABLE IF EXISTS public."IPMNS" CASCADE;
DROP TABLE IF EXISTS public."IPNAME" CASCADE;
DROP TABLE IF EXISTS public."IPOKVED" CASCADE;
DROP TABLE IF EXISTS public."IPPF" CASCADE;
DROP TABLE IF EXISTS public."IPREGOLD" CASCADE;
DROP TABLE IF EXISTS public."IUL" CASCADE;
DROP TABLE IF EXISTS public."LICENZ" CASCADE;
DROP TABLE IF EXISTS public."OKATO_RAION" CASCADE;
DROP TABLE IF EXISTS public."OKSM" CASCADE;
DROP TABLE IF EXISTS public."OKVED" CASCADE;
DROP TABLE IF EXISTS public."POST_INDEXES" CASCADE;
DROP TABLE IF EXISTS public."PREFIKS_RAION" CASCADE;
DROP TABLE IF EXISTS public."RAION" CASCADE;
DROP TABLE IF EXISTS public."REESTRAO" CASCADE;
DROP TABLE IF EXISTS public."RG" CASCADE;
DROP TABLE IF EXISTS public."RUL" CASCADE;
DROP TABLE IF EXISTS public."SPDOKDN" CASCADE;
DROP TABLE IF EXISTS public."SPFOMS" CASCADE;
DROP TABLE IF EXISTS public."SPFSS" CASCADE;
DROP TABLE IF EXISTS public."SPIPSTAT" CASCADE;
DROP TABLE IF EXISTS public."SPLANG" CASCADE;
DROP TABLE IF EXISTS public."SPLICORG" CASCADE;
DROP TABLE IF EXISTS public."SPMNS" CASCADE;
DROP TABLE IF EXISTS public."SPOPF" CASCADE;
DROP TABLE IF EXISTS public."SPOSNDN" CASCADE;
DROP TABLE IF EXISTS public."SPPF" CASCADE;
DROP TABLE IF EXISTS public."SPREGORG" CASCADE;
DROP TABLE IF EXISTS public."SPSOSTLIC" CASCADE;
DROP TABLE IF EXISTS public."SPULSTAT" CASCADE;
DROP TABLE IF EXISTS public."SPVIDADR" CASCADE;
DROP TABLE IF EXISTS public."SPVIDCAP" CASCADE;
DROP TABLE IF EXISTS public."SPVIDCITIZEN" CASCADE;
DROP TABLE IF EXISTS public."SPVIDIP" CASCADE;
DROP TABLE IF EXISTS public."SPVIDLIC" CASCADE;
DROP TABLE IF EXISTS public."SPVIDREG" CASCADE;
DROP TABLE IF EXISTS public."ST" CASCADE;
DROP TABLE IF EXISTS public."UL" CASCADE;
DROP TABLE IF EXISTS public."UL_ACTUAL_DATA" CASCADE;
DROP TABLE IF EXISTS public."ULADR" CASCADE;
DROP TABLE IF EXISTS public."ULCAPITAL" CASCADE;
DROP TABLE IF EXISTS public."ULFOMS" CASCADE;
DROP TABLE IF EXISTS public."ULFSS" CASCADE;
DROP TABLE IF EXISTS public."ULMNS" CASCADE;
DROP TABLE IF EXISTS public."ULNAME" CASCADE;
DROP TABLE IF EXISTS public."ULNAME_FULL" CASCADE;
DROP TABLE IF EXISTS public."ULOB" CASCADE;
DROP TABLE IF EXISTS public."ULOKVED" CASCADE;
DROP TABLE IF EXISTS public."ULPF" CASCADE;
DROP TABLE IF EXISTS public."ULPREDSH" CASCADE;
DROP TABLE IF EXISTS public."ULPREEM" CASCADE;
DROP TABLE IF EXISTS public."ULUPR" CASCADE;
DROP TABLE IF EXISTS public."vidlic" CASCADE;
DROP TABLE IF EXISTS public."XML_LOAD_LOG" CASCADE;

--
-- DROP SEQUENCES IF EXISTS
--

DROP SEQUENCE IF EXISTS public.seq_cn;
DROP SEQUENCE IF EXISTS public.seq_ct;
DROP SEQUENCE IF EXISTS public.seq_ds;
DROP SEQUENCE IF EXISTS public.seq_fl;
DROP SEQUENCE IF EXISTS public.seq_fldolgn;
DROP SEQUENCE IF EXISTS public.seq_fluchr;
DROP SEQUENCE IF EXISTS public.seq_gosreg;
DROP SEQUENCE IF EXISTS public.seq_ip;
DROP SEQUENCE IF EXISTS public.seq_ipcitizen;
DROP SEQUENCE IF EXISTS public.seq_ipdokdsn;
DROP SEQUENCE IF EXISTS public.seq_ipfoms;
DROP SEQUENCE IF EXISTS public.seq_ipfss;
DROP SEQUENCE IF EXISTS public.seq_ipgosreg;
DROP SEQUENCE IF EXISTS public.seq_ipmns;
DROP SEQUENCE IF EXISTS public.seq_ipname;
DROP SEQUENCE IF EXISTS public.seq_ipokved;
DROP SEQUENCE IF EXISTS public.seq_ippf;
DROP SEQUENCE IF EXISTS public.seq_ipregold;
DROP SEQUENCE IF EXISTS public.seq_iul;
DROP SEQUENCE IF EXISTS public.seq_licenz;
DROP SEQUENCE IF EXISTS public.seq_okato_raion;
DROP SEQUENCE IF EXISTS public.seq_oksm;
DROP SEQUENCE IF EXISTS public.seq_okved;
DROP SEQUENCE IF EXISTS public.seq_post_indexes;
DROP SEQUENCE IF EXISTS public.seq_prefiks_raion;
DROP SEQUENCE IF EXISTS public.seq_raion;
DROP SEQUENCE IF EXISTS public.seq_reestrao;
DROP SEQUENCE IF EXISTS public.seq_rg;
DROP SEQUENCE IF EXISTS public.seq_rul;
DROP SEQUENCE IF EXISTS public.seq_spdokdn;
DROP SEQUENCE IF EXISTS public.seq_spfoms;
DROP SEQUENCE IF EXISTS public.seq_spfss;
DROP SEQUENCE IF EXISTS public.seq_spipstat;
DROP SEQUENCE IF EXISTS public.seq_splang;
DROP SEQUENCE IF EXISTS public.seq_splicorg;
DROP SEQUENCE IF EXISTS public.seq_spmns;
DROP SEQUENCE IF EXISTS public.seq_spopf;
DROP SEQUENCE IF EXISTS public.seq_sposndn;
DROP SEQUENCE IF EXISTS public.seq_sppf;
DROP SEQUENCE IF EXISTS public.seq_spregorg;
DROP SEQUENCE IF EXISTS public.seq_spsostlic;
DROP SEQUENCE IF EXISTS public.seq_spulstat;
DROP SEQUENCE IF EXISTS public.seq_spvidadr;
DROP SEQUENCE IF EXISTS public.seq_spvidcap;
DROP SEQUENCE IF EXISTS public.seq_spvidcitizen;
DROP SEQUENCE IF EXISTS public.seq_spvidip;
DROP SEQUENCE IF EXISTS public.seq_spvidlic;
DROP SEQUENCE IF EXISTS public.seq_spvidreg;
DROP SEQUENCE IF EXISTS public.seq_st;
DROP SEQUENCE IF EXISTS public.seq_ul;
DROP SEQUENCE IF EXISTS public.seq_ul_actual_data;
DROP SEQUENCE IF EXISTS public.seq_uladr;
DROP SEQUENCE IF EXISTS public.seq_ulcapital;
DROP SEQUENCE IF EXISTS public.seq_ulfoms;
DROP SEQUENCE IF EXISTS public.seq_ulfss;
DROP SEQUENCE IF EXISTS public.seq_ulmns;
DROP SEQUENCE IF EXISTS public.seq_ulname;
DROP SEQUENCE IF EXISTS public.seq_ulname_full;
DROP SEQUENCE IF EXISTS public.seq_ulob;
DROP SEQUENCE IF EXISTS public.seq_ulokved;
DROP SEQUENCE IF EXISTS public.seq_ulpf;
DROP SEQUENCE IF EXISTS public.seq_ulpredsh;
DROP SEQUENCE IF EXISTS public.seq_ulpreem;
DROP SEQUENCE IF EXISTS public.seq_ulupr;
DROP SEQUENCE IF EXISTS public.seq_xml_load_log;

--
-- Name: CN; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."CN" (
    idn bigint NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    kod_kl text,
    name text,
    row_check_sum text
);


ALTER TABLE public."CN" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "CN"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."CN" IS 'Справочник "Населенные пункты"';


--
-- Name: COLUMN "CN".idn; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."CN".idn IS 'Идентификатор населенного пункта';


--
-- Name: COLUMN "CN".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."CN".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "CN".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."CN".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "CN".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."CN".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "CN".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."CN".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "CN".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."CN".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "CN".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."CN".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "CN".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."CN".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "CN".kod_kl; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."CN".kod_kl IS 'Код по справочнику КЛАДР';


--
-- Name: COLUMN "CN".name; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."CN".name IS 'Наименование населенного пункт';


--
-- Name: CT; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."CT" (
    idc bigint NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    kod_kl text,
    name text,
    row_check_sum text
);


ALTER TABLE public."CT" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "CT"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."CT" IS 'Справочник "Города"';


--
-- Name: COLUMN "CT".idc; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."CT".idc IS 'Идентификатор города';


--
-- Name: COLUMN "CT".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."CT".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "CT".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."CT".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "CT".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."CT".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "CT".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."CT".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "CT".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."CT".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "CT".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."CT".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "CT".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."CT".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "CT".kod_kl; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."CT".kod_kl IS 'Код по справочнику КЛАДР';


--
-- Name: COLUMN "CT".name; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."CT".name IS 'Наименование города';


--
-- Name: DS; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."DS" (
    idd bigint NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    kod_kl text,
    name text,
    row_check_sum text
);


ALTER TABLE public."DS" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "DS"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."DS" IS 'Справочник "Районы РФ"';


--
-- Name: COLUMN "DS".idd; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."DS".idd IS 'Идентификатор района РФ';


--
-- Name: COLUMN "DS".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."DS".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "DS".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."DS".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "DS".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."DS".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "DS".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."DS".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "DS".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."DS".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "DS".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."DS".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "DS".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."DS".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "DS".kod_kl; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."DS".kod_kl IS 'Код по справочнику КЛАДР';


--
-- Name: COLUMN "DS".name; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."DS".name IS 'Наименование района РФ';


--
-- Name: FL; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."FL" (
    idfl integer NOT NULL,
    famfl text,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    inn text,
    namefl text,
    otchfl text,
    row_check_sum text
);


ALTER TABLE public."FL" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "FL"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."FL" IS 'Физические лица';


--
-- Name: COLUMN "FL".idfl; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FL".idfl IS 'Идентификатор физического лица';


--
-- Name: COLUMN "FL".famfl; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FL".famfl IS 'Фамилия';


--
-- Name: COLUMN "FL".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FL".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "FL".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FL".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "FL".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FL".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "FL".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FL".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "FL".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FL".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "FL".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FL".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "FL".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FL".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "FL".inn; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FL".inn IS 'ИНН';


--
-- Name: COLUMN "FL".namefl; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FL".namefl IS 'Имя';


--
-- Name: COLUMN "FL".otchfl; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FL".otchfl IS 'Отчество';


--
-- Name: FLDOLGN; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."FLDOLGN" (
    idfldolgn integer NOT NULL,
    dolgn text,
    dtstart timestamp without time zone,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    row_check_sum text,
    idfl integer,
    idul text
);


ALTER TABLE public."FLDOLGN" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "FLDOLGN"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."FLDOLGN" IS 'Должности ФЛ';


--
-- Name: COLUMN "FLDOLGN".idfldolgn; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLDOLGN".idfldolgn IS 'Идентификатор записи';


--
-- Name: COLUMN "FLDOLGN".dolgn; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLDOLGN".dolgn IS 'Должность';


--
-- Name: COLUMN "FLDOLGN".dtstart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLDOLGN".dtstart IS 'Дата начала действия';


--
-- Name: COLUMN "FLDOLGN".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLDOLGN".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "FLDOLGN".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLDOLGN".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "FLDOLGN".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLDOLGN".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "FLDOLGN".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLDOLGN".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "FLDOLGN".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLDOLGN".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "FLDOLGN".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLDOLGN".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "FLDOLGN".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLDOLGN".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "FLDOLGN".idfl; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLDOLGN".idfl IS 'Идентификатор ФЛ';


--
-- Name: COLUMN "FLDOLGN".idul; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLDOLGN".idul IS 'Идентификатор ЮЛ';


--
-- Name: FLUCHR; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."FLUCHR" (
    idfluchr integer NOT NULL,
    dtstart timestamp without time zone,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    row_check_sum text,
    summa bigint,
    idfl integer,
    idul text
);


ALTER TABLE public."FLUCHR" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "FLUCHR"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."FLUCHR" IS 'Сведения об учредителях - физических лицах';


--
-- Name: COLUMN "FLUCHR".idfluchr; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLUCHR".idfluchr IS 'Идентификатор записи';


--
-- Name: COLUMN "FLUCHR".dtstart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLUCHR".dtstart IS 'Дата начала действия';


--
-- Name: COLUMN "FLUCHR".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLUCHR".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "FLUCHR".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLUCHR".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "FLUCHR".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLUCHR".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "FLUCHR".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLUCHR".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "FLUCHR".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLUCHR".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "FLUCHR".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLUCHR".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "FLUCHR".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLUCHR".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "FLUCHR".summa; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLUCHR".summa IS 'Размер вклада в уставный капитал';


--
-- Name: COLUMN "FLUCHR".idfl; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLUCHR".idfl IS 'Идентификатор ФЛ';


--
-- Name: COLUMN "FLUCHR".idul; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLUCHR".idul IS 'Идентификатор ЮЛ';


--
-- Name: GOSREG; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."GOSREG" (
    idreg text NOT NULL,
    dtreg timestamp without time zone,
    dtzap timestamp without time zone,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    numsvid integer,
    regnum text,
    row_check_sum text,
    sersvid integer,
    idregorg text,
    idul text,
    idvidreg integer
);


ALTER TABLE public."GOSREG" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "GOSREG"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."GOSREG" IS 'Сведения о государственной регистрации';


--
-- Name: COLUMN "GOSREG".idreg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."GOSREG".idreg IS 'Идентификатор записи';


--
-- Name: COLUMN "GOSREG".dtreg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."GOSREG".dtreg IS 'Дата регистрации';


--
-- Name: COLUMN "GOSREG".dtzap; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."GOSREG".dtzap IS 'Дата правки';


--
-- Name: COLUMN "GOSREG".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."GOSREG".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "GOSREG".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."GOSREG".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "GOSREG".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."GOSREG".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "GOSREG".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."GOSREG".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "GOSREG".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."GOSREG".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "GOSREG".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."GOSREG".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "GOSREG".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."GOSREG".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "GOSREG".numsvid; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."GOSREG".numsvid IS 'Номер свидетельства';


--
-- Name: COLUMN "GOSREG".regnum; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."GOSREG".regnum IS 'Номер регистрации';


--
-- Name: COLUMN "GOSREG".sersvid; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."GOSREG".sersvid IS 'Серия свидетельства';


--
-- Name: COLUMN "GOSREG".idregorg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."GOSREG".idregorg IS 'Регистрирующий орган (id)';


--
-- Name: COLUMN "GOSREG".idul; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."GOSREG".idul IS 'Идентификатор ЮЛ';


--
-- Name: COLUMN "GOSREG".idvidreg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."GOSREG".idvidreg IS 'Вид регистрации (id)';


--
-- Name: IP; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."IP" (
    idip text NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    inn text,
    ipend timestamp without time zone,
    ipstart timestamp without time zone,
    ogrn text,
    row_check_sum text,
    idregorg text,
    idstatus integer,
    idvidip integer
);


ALTER TABLE public."IP" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "IP"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."IP" IS 'Индивидуальные предприниматели';


--
-- Name: COLUMN "IP".idip; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".idip IS 'Идентификатор ИП';


--
-- Name: COLUMN "IP".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "IP".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "IP".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "IP".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "IP".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "IP".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "IP".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "IP".inn; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".inn IS 'ИНН';


--
-- Name: COLUMN "IP".ipend; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".ipend IS 'Дата прекращения деятельности';


--
-- Name: COLUMN "IP".ipstart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".ipstart IS 'Дата регистрации';


--
-- Name: COLUMN "IP".ogrn; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".ogrn IS 'ОГРН';


--
-- Name: COLUMN "IP".idregorg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".idregorg IS 'Орган регистрации (id)';


--
-- Name: COLUMN "IP".idstatus; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".idstatus IS 'Состояние ИП (id)';


--
-- Name: COLUMN "IP".idvidip; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".idvidip IS 'Вид: ИП или глава КФХ (id)';


--
-- Name: IPCITIZEN; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."IPCITIZEN" (
    idipcitizen integer NOT NULL,
    dtstart timestamp without time zone,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    row_check_sum text,
    idip text,
    idvidcitizen integer,
    oksm integer
);


ALTER TABLE public."IPCITIZEN" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "IPCITIZEN"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."IPCITIZEN" IS 'Сведения о гражданстве ИП';


--
-- Name: COLUMN "IPCITIZEN".idipcitizen; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPCITIZEN".idipcitizen IS 'ID';


--
-- Name: COLUMN "IPCITIZEN".dtstart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPCITIZEN".dtstart IS 'Дата внесения записи';


--
-- Name: COLUMN "IPCITIZEN".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPCITIZEN".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "IPCITIZEN".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPCITIZEN".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "IPCITIZEN".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPCITIZEN".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "IPCITIZEN".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPCITIZEN".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "IPCITIZEN".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPCITIZEN".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "IPCITIZEN".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPCITIZEN".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "IPCITIZEN".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPCITIZEN".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "IPCITIZEN".idip; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPCITIZEN".idip IS 'Идентификатор ИП';


--
-- Name: COLUMN "IPCITIZEN".idvidcitizen; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPCITIZEN".idvidcitizen IS 'Вид гражданства (id)';


--
-- Name: COLUMN "IPCITIZEN".oksm; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPCITIZEN".oksm IS 'Страна (id)';


--
-- Name: IPDOKDSN; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."IPDOKDSN" (
    iddokdsn integer NOT NULL,
    dt timestamp without time zone,
    dtstart timestamp without time zone,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    nameorg text,
    num text,
    row_check_sum text,
    iddokdn integer,
    idip text NOT NULL,
    idosndn integer
);


ALTER TABLE public."IPDOKDSN" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "IPDOKDSN"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."IPDOKDSN" IS 'Документы, подтвержд. приобретение дееспособности несовершеннолетним';


--
-- Name: COLUMN "IPDOKDSN".iddokdsn; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPDOKDSN".iddokdsn IS 'ID';


--
-- Name: COLUMN "IPDOKDSN".dt; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPDOKDSN".dt IS 'Дата выдачи документа';


--
-- Name: COLUMN "IPDOKDSN".dtstart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPDOKDSN".dtstart IS 'Дата внесения записи';


--
-- Name: COLUMN "IPDOKDSN".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPDOKDSN".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "IPDOKDSN".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPDOKDSN".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "IPDOKDSN".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPDOKDSN".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "IPDOKDSN".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPDOKDSN".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "IPDOKDSN".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPDOKDSN".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "IPDOKDSN".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPDOKDSN".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "IPDOKDSN".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPDOKDSN".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "IPDOKDSN".nameorg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPDOKDSN".nameorg IS 'Наименование органа, выдавшего документ';


--
-- Name: COLUMN "IPDOKDSN".num; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPDOKDSN".num IS 'Номер документа';


--
-- Name: COLUMN "IPDOKDSN".iddokdn; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPDOKDSN".iddokdn IS 'Вид документа, подтвержд. приобретение дееспособности (id)';


--
-- Name: COLUMN "IPDOKDSN".idip; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPDOKDSN".idip IS 'Идентификатор ИП';


--
-- Name: COLUMN "IPDOKDSN".idosndn; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPDOKDSN".idosndn IS 'Основание приобретения дееспособности (id)';


--
-- Name: IPFOMS; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."IPFOMS" (
    idipfoms integer NOT NULL,
    dtend timestamp without time zone,
    dtstart timestamp without time zone,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    regnom_foms text,
    row_check_sum text,
    idfoms integer,
    idip text
);


ALTER TABLE public."IPFOMS" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "IPFOMS"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."IPFOMS" IS 'Сведения о регистрации ИП в отделениях ФОМС';


--
-- Name: COLUMN "IPFOMS".idipfoms; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPFOMS".idipfoms IS 'ID';


--
-- Name: COLUMN "IPFOMS".dtend; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPFOMS".dtend IS 'Дата снятия с учета';


--
-- Name: COLUMN "IPFOMS".dtstart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPFOMS".dtstart IS 'Дата постановки на учет';


--
-- Name: COLUMN "IPFOMS".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPFOMS".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "IPFOMS".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPFOMS".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "IPFOMS".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPFOMS".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "IPFOMS".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPFOMS".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "IPFOMS".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPFOMS".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "IPFOMS".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPFOMS".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "IPFOMS".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPFOMS".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "IPFOMS".regnom_foms; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPFOMS".regnom_foms IS 'Регистрационный номер в фонде';


--
-- Name: COLUMN "IPFOMS".idfoms; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPFOMS".idfoms IS 'Территориальный орган ФОМС (id)';


--
-- Name: COLUMN "IPFOMS".idip; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPFOMS".idip IS 'Идентификатор ИП';


--
-- Name: IPFSS; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."IPFSS" (
    idipfss integer NOT NULL,
    dtend timestamp without time zone,
    dtstart timestamp without time zone,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    regnom_fss text,
    row_check_sum text,
    idfss integer,
    idip text
);


ALTER TABLE public."IPFSS" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "IPFSS"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."IPFSS" IS 'Сведения о регистрации ИП в отделениях ФСС';


--
-- Name: COLUMN "IPFSS".idipfss; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPFSS".idipfss IS 'ID';


--
-- Name: COLUMN "IPFSS".dtend; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPFSS".dtend IS 'Дата снятия с учета';


--
-- Name: COLUMN "IPFSS".dtstart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPFSS".dtstart IS 'Дата постановки на учет';


--
-- Name: COLUMN "IPFSS".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPFSS".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "IPFSS".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPFSS".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "IPFSS".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPFSS".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "IPFSS".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPFSS".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "IPFSS".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPFSS".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "IPFSS".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPFSS".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "IPFSS".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPFSS".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "IPFSS".regnom_fss; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPFSS".regnom_fss IS 'Реестровый номер в фонде';


--
-- Name: COLUMN "IPFSS".idfss; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPFSS".idfss IS 'Территориальный орган ФСС (id)';


--
-- Name: COLUMN "IPFSS".idip; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPFSS".idip IS 'Идентификатор ИП';


--
-- Name: IPGOSREG; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."IPGOSREG" (
    regnum text NOT NULL,
    idreg text NOT NULL,
    dtreg timestamp without time zone,
    dtzap timestamp without time zone,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    numsvid integer,
    row_check_sum text,
    sersvid integer,
    idip text,
    idregorg text,
    idvidreg integer
);


ALTER TABLE public."IPGOSREG" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "IPGOSREG"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."IPGOSREG" IS 'Сведения о записях в ЕГРИП';


--
-- Name: COLUMN "IPGOSREG".regnum; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPGOSREG".regnum IS 'Гос. регистрационный номер записи';


--
-- Name: COLUMN "IPGOSREG".idreg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPGOSREG".idreg IS 'Регистрационный номер в базе данных';


--
-- Name: COLUMN "IPGOSREG".dtreg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPGOSREG".dtreg IS 'Дата внесения записи';


--
-- Name: COLUMN "IPGOSREG".dtzap; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPGOSREG".dtzap IS 'Дата занесения записи в базу данных';


--
-- Name: COLUMN "IPGOSREG".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPGOSREG".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "IPGOSREG".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPGOSREG".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "IPGOSREG".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPGOSREG".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "IPGOSREG".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPGOSREG".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "IPGOSREG".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPGOSREG".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "IPGOSREG".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPGOSREG".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "IPGOSREG".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPGOSREG".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "IPGOSREG".numsvid; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPGOSREG".numsvid IS 'Номер свидетельсва';


--
-- Name: COLUMN "IPGOSREG".sersvid; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPGOSREG".sersvid IS 'Серия свидетельства';


--
-- Name: COLUMN "IPGOSREG".idip; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPGOSREG".idip IS 'Идентификатор ИП';


--
-- Name: COLUMN "IPGOSREG".idregorg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPGOSREG".idregorg IS 'Регистрирующий орган (id)';


--
-- Name: COLUMN "IPGOSREG".idvidreg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPGOSREG".idvidreg IS 'Вид регистрации (id)';


--
-- Name: IPMNS; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."IPMNS" (
    idipmns integer NOT NULL,
    dtend timestamp without time zone,
    dtstart timestamp without time zone,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    row_check_sum text,
    idip text,
    idmns integer
);


ALTER TABLE public."IPMNS" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "IPMNS"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."IPMNS" IS 'Сведения о постановке на учет ИП в налоговом органе';


--
-- Name: COLUMN "IPMNS".idipmns; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPMNS".idipmns IS 'ID';


--
-- Name: COLUMN "IPMNS".dtend; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPMNS".dtend IS 'Дата снятия с учета';


--
-- Name: COLUMN "IPMNS".dtstart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPMNS".dtstart IS 'Дата постановки на учет';


--
-- Name: COLUMN "IPMNS".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPMNS".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "IPMNS".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPMNS".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "IPMNS".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPMNS".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "IPMNS".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPMNS".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "IPMNS".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPMNS".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "IPMNS".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPMNS".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "IPMNS".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPMNS".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "IPMNS".idip; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPMNS".idip IS 'Идентификатор ИП';


--
-- Name: COLUMN "IPMNS".idmns; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPMNS".idmns IS 'Налоговый орган (id)';


--
-- Name: IPNAME; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."IPNAME" (
    idipname integer NOT NULL,
    dtstart timestamp without time zone,
    famfl text,
    famlat text,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    namefl text,
    namelat text,
    otchfl text,
    otchlat text,
    row_check_sum text,
    sex integer,
    idip text
);


ALTER TABLE public."IPNAME" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "IPNAME"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."IPNAME" IS 'ФИО индивидуальных предпринимателей';


--
-- Name: COLUMN "IPNAME".idipname; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPNAME".idipname IS 'ID';


--
-- Name: COLUMN "IPNAME".dtstart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPNAME".dtstart IS 'Дата внесения записи';


--
-- Name: COLUMN "IPNAME".famfl; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPNAME".famfl IS 'Фамилия';


--
-- Name: COLUMN "IPNAME".famlat; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPNAME".famlat IS 'Фамилия латинскими буквами';


--
-- Name: COLUMN "IPNAME".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPNAME".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "IPNAME".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPNAME".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "IPNAME".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPNAME".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "IPNAME".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPNAME".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "IPNAME".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPNAME".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "IPNAME".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPNAME".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "IPNAME".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPNAME".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "IPNAME".namefl; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPNAME".namefl IS 'Имя';


--
-- Name: COLUMN "IPNAME".namelat; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPNAME".namelat IS 'Имя латинскими буквами';


--
-- Name: COLUMN "IPNAME".otchfl; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPNAME".otchfl IS 'Отчество';


--
-- Name: COLUMN "IPNAME".otchlat; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPNAME".otchlat IS 'Отчество латинскими буквами';


--
-- Name: COLUMN "IPNAME".sex; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPNAME".sex IS 'Пол';


--
-- Name: COLUMN "IPNAME".idip; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPNAME".idip IS 'Идентификатор ИП';


--
-- Name: IPOKVED; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."IPOKVED" (
    idipokved integer NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    main integer,
    row_check_sum text,
    idip text NOT NULL,
    idokved integer
);


ALTER TABLE public."IPOKVED" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "IPOKVED"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."IPOKVED" IS 'Виды экономической деятельности ИП';


--
-- Name: COLUMN "IPOKVED".idipokved; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPOKVED".idipokved IS 'ID';


--
-- Name: COLUMN "IPOKVED".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPOKVED".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "IPOKVED".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPOKVED".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "IPOKVED".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPOKVED".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "IPOKVED".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPOKVED".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "IPOKVED".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPOKVED".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "IPOKVED".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPOKVED".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "IPOKVED".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPOKVED".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "IPOKVED".main; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPOKVED".main IS 'Признак "Основной вид деятельности"';


--
-- Name: COLUMN "IPOKVED".idip; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPOKVED".idip IS 'Идентифатор ИП';


--
-- Name: COLUMN "IPOKVED".idokved; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPOKVED".idokved IS 'Идентификатор вида деятельности';


--
-- Name: IPPF; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."IPPF" (
    idippf integer NOT NULL,
    dtend timestamp without time zone,
    dtstart timestamp without time zone,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    regnom_pf text,
    row_check_sum text,
    idip text,
    idpf integer
);


ALTER TABLE public."IPPF" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "IPPF"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."IPPF" IS 'Сведения о регистрации ИП в отделениях ПФ';


--
-- Name: COLUMN "IPPF".idippf; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPPF".idippf IS 'ID';


--
-- Name: COLUMN "IPPF".dtend; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPPF".dtend IS 'Дата снятия с учета';


--
-- Name: COLUMN "IPPF".dtstart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPPF".dtstart IS 'Дата постановки на учет';


--
-- Name: COLUMN "IPPF".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPPF".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "IPPF".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPPF".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "IPPF".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPPF".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "IPPF".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPPF".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "IPPF".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPPF".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "IPPF".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPPF".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "IPPF".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPPF".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "IPPF".regnom_pf; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPPF".regnom_pf IS 'Регистрационный номер в фонде';


--
-- Name: COLUMN "IPPF".idip; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPPF".idip IS 'Идентификатор ПФ';


--
-- Name: COLUMN "IPPF".idpf; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPPF".idpf IS 'Территориальный орган ПФ (id)';


--
-- Name: IPREGOLD; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."IPREGOLD" (
    idipregold integer NOT NULL,
    dtreg timestamp without time zone,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    numold text,
    row_check_sum text,
    idip text,
    idregorg text
);


ALTER TABLE public."IPREGOLD" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "IPREGOLD"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."IPREGOLD" IS 'Сведения о регистрации ФЛ в качестве ИП до 01.01.2004';


--
-- Name: COLUMN "IPREGOLD".idipregold; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPREGOLD".idipregold IS 'ID';


--
-- Name: COLUMN "IPREGOLD".dtreg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPREGOLD".dtreg IS 'Дата регистрации';


--
-- Name: COLUMN "IPREGOLD".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPREGOLD".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "IPREGOLD".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPREGOLD".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "IPREGOLD".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPREGOLD".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "IPREGOLD".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPREGOLD".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "IPREGOLD".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPREGOLD".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "IPREGOLD".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPREGOLD".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "IPREGOLD".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPREGOLD".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "IPREGOLD".numold; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPREGOLD".numold IS 'Регистрационный номер';


--
-- Name: COLUMN "IPREGOLD".idip; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPREGOLD".idip IS 'Идентификатор ИП';


--
-- Name: COLUMN "IPREGOLD".idregorg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IPREGOLD".idregorg IS 'Регистрирующий орган (id)';


--
-- Name: IUL; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."IUL" (
    idiul integer NOT NULL,
    dtreg timestamp without time zone,
    dtstart timestamp without time zone,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    inadr text,
    namep text,
    row_check_sum text,
    summa bigint,
    idoksm integer,
    idul text
);


ALTER TABLE public."IUL" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "IUL"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."IUL" IS 'Сведения об учредителях - иностранных ЮЛ';


--
-- Name: COLUMN "IUL".idiul; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IUL".idiul IS 'Идентификтор иностранного ЮЛ';


--
-- Name: COLUMN "IUL".dtreg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IUL".dtreg IS 'Дата регистрации';


--
-- Name: COLUMN "IUL".dtstart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IUL".dtstart IS 'Дата начала действия';


--
-- Name: COLUMN "IUL".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IUL".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "IUL".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IUL".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "IUL".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IUL".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "IUL".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IUL".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "IUL".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IUL".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "IUL".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IUL".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "IUL".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IUL".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "IUL".inadr; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IUL".inadr IS 'Адрес';


--
-- Name: COLUMN "IUL".namep; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IUL".namep IS 'Полное наименование иностранного ЮЛ';


--
-- Name: COLUMN "IUL".summa; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IUL".summa IS 'Размер вклада в уставный капитал';


--
-- Name: COLUMN "IUL".idoksm; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IUL".idoksm IS 'Код страны';


--
-- Name: COLUMN "IUL".idul; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IUL".idul IS 'Идентификатор ЮЛ';


--
-- Name: LICENZ; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."LICENZ" (
    idlic integer NOT NULL,
    dtend timestamp without time zone,
    dtrestart timestamp without time zone,
    dtstart timestamp without time zone,
    dtstop timestamp without time zone,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    numlic text,
    row_check_sum text,
    idip text,
    idlicorg text,
    idsostlic integer,
    idul text,
    idvidlic bigint
);


ALTER TABLE public."LICENZ" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "LICENZ"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."LICENZ" IS 'Лицензии';


--
-- Name: COLUMN "LICENZ".idlic; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."LICENZ".idlic IS 'Идентификатор записи';


--
-- Name: COLUMN "LICENZ".dtend; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."LICENZ".dtend IS 'Дата окончания действия';


--
-- Name: COLUMN "LICENZ".dtrestart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."LICENZ".dtrestart IS 'Дата возобновления действия лицензии';


--
-- Name: COLUMN "LICENZ".dtstart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."LICENZ".dtstart IS 'Дата начала действия';


--
-- Name: COLUMN "LICENZ".dtstop; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."LICENZ".dtstop IS 'Дата приостановки действия лицензии';


--
-- Name: COLUMN "LICENZ".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."LICENZ".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "LICENZ".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."LICENZ".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "LICENZ".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."LICENZ".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "LICENZ".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."LICENZ".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "LICENZ".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."LICENZ".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "LICENZ".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."LICENZ".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "LICENZ".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."LICENZ".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "LICENZ".numlic; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."LICENZ".numlic IS 'Номер лицензии';


--
-- Name: COLUMN "LICENZ".idip; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."LICENZ".idip IS 'IDIP';


--
-- Name: COLUMN "LICENZ".idlicorg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."LICENZ".idlicorg IS 'Идентификатор лицензирующего органа';


--
-- Name: COLUMN "LICENZ".idsostlic; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."LICENZ".idsostlic IS 'Статус лицензии';


--COMMENT ON TABLE public."REESTRAO"
-- Name: COLUMN "LICENZ".idul; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."LICENZ".idul IS 'Идентификатор ЮЛ';


--
-- Name: COLUMN "LICENZ".idvidlic; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."LICENZ".idvidlic IS 'Вид деятельности';


--
-- Name: OKATO_RAION; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."OKATO_RAION" (
    okato text NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    id_raion integer,
    row_check_sum text
);


ALTER TABLE public."OKATO_RAION" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "OKATO_RAION"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."OKATO_RAION" IS 'Таблица связи "ОКАТО - Район СПб"';


--
-- Name: COLUMN "OKATO_RAION".okato; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKATO_RAION".okato IS 'OKATO';


--
-- Name: COLUMN "OKATO_RAION".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKATO_RAION".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "OKATO_RAION".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKATO_RAION".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "OKATO_RAION".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKATO_RAION".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "OKATO_RAION".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKATO_RAION".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "OKATO_RAION".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKATO_RAION".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "OKATO_RAION".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKATO_RAION".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "OKATO_RAION".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKATO_RAION".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "OKATO_RAION".id_raion; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKATO_RAION".id_raion IS 'Код района СПб';


--
-- Name: OKSM; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."OKSM" (
    id integer NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    kod_oksm text,
    name text,
    row_check_sum text
);


ALTER TABLE public."OKSM" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "OKSM"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."OKSM" IS 'Справочник "Страны мира"';


--
-- Name: COLUMN "OKSM".id; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKSM".id IS 'Идентификатор страны';


--
-- Name: COLUMN "OKSM".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKSM".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "OKSM".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKSM".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "OKSM".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKSM".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "OKSM".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKSM".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "OKSM".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKSM".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "OKSM".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKSM".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "OKSM".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKSM".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "OKSM".kod_oksm; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKSM".kod_oksm IS 'Код по классификатору ОКСМ';


--
-- Name: COLUMN "OKSM".name; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKSM".name IS 'Наименование страны';


--
-- Name: OKVED; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."OKVED" (
    idokved integer NOT NULL,
    code_okved text,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    name text,
    row_check_sum text
);


ALTER TABLE public."OKVED" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "OKVED"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."OKVED" IS 'Справочник "Виды экономической деятельности"';


--
-- Name: COLUMN "OKVED".idokved; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKVED".idokved IS 'Идентификатор записи';


--
-- Name: COLUMN "OKVED".code_okved; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKVED".code_okved IS 'Kод ОКВЭД';


--
-- Name: COLUMN "OKVED".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKVED".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "OKVED".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKVED".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "OKVED".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKVED".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "OKVED".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKVED".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "OKVED".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKVED".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "OKVED".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKVED".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "OKVED".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKVED".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "OKVED".name; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKVED".name IS 'Наименование вида деятельности';


--
-- Name: POST_INDEXES; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."POST_INDEXES" (
    id_post_raion integer NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    id_raion integer,
    post_index text,
    row_check_sum text
);


ALTER TABLE public."POST_INDEXES" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "POST_INDEXES"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."POST_INDEXES" IS 'Таблица связи "Почтовый индекс - Район СПб"';


--
-- Name: COLUMN "POST_INDEXES".id_post_raion; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."POST_INDEXES".id_post_raion IS 'Идентификатор записи';


--
-- Name: COLUMN "POST_INDEXES".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."POST_INDEXES".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "POST_INDEXES".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."POST_INDEXES".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "POST_INDEXES".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."POST_INDEXES".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "POST_INDEXES".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."POST_INDEXES".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "POST_INDEXES".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."POST_INDEXES".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "POST_INDEXES".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."POST_INDEXES".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "POST_INDEXES".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."POST_INDEXES".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "POST_INDEXES".id_raion; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."POST_INDEXES".id_raion IS 'Код района СПб';


--
-- Name: COLUMN "POST_INDEXES".post_index; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."POST_INDEXES".post_index IS 'Почтовый индекс';


--
-- Name: PREFIKS_RAION; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."PREFIKS_RAION" (
    id_prefiks integer NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    id_raion integer,
    row_check_sum text
);


ALTER TABLE public."PREFIKS_RAION" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "PREFIKS_RAION"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."PREFIKS_RAION" IS 'Таблица связи "Префиксы - Районы"';


--
-- Name: COLUMN "PREFIKS_RAION".id_prefiks; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."PREFIKS_RAION".id_prefiks IS 'Код префикса';


--
-- Name: COLUMN "PREFIKS_RAION".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."PREFIKS_RAION".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "PREFIKS_RAION".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."PREFIKS_RAION".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "PREFIKS_RAION".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."PREFIKS_RAION".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "PREFIKS_RAION".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."PREFIKS_RAION".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "PREFIKS_RAION".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."PREFIKS_RAION".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "PREFIKS_RAION".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."PREFIKS_RAION".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "PREFIKS_RAION".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."PREFIKS_RAION".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "PREFIKS_RAION".id_raion; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."PREFIKS_RAION".id_raion IS 'Код района СПб';


--
-- Name: RAION; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."RAION" (
    id_raion bigint NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    name text,
    row_check_sum text,
    status integer NOT NULL
);


ALTER TABLE public."RAION" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "RAION"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."RAION" IS 'Справочник "Районы СПб"';


--
-- Name: COLUMN "RAION".id_raion; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RAION".id_raion IS 'Код района';


--
-- Name: COLUMN "RAION".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RAION".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "RAION".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RAION".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "RAION".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RAION".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "RAION".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RAION".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "RAION".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RAION".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "RAION".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RAION".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "RAION".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RAION".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "RAION".name; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RAION".name IS 'Наименование района СПб';


--
-- Name: COLUMN "RAION".status; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RAION".status IS 'Статус записи';


--
-- Name: REESTRAO; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."REESTRAO" (
    idreestrao integer NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    namep text,
    ogrn text,
    row_check_sum text,
    idul text
);


ALTER TABLE public."REESTRAO" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "REESTRAO"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."REESTRAO" IS 'Держатели реестра акционеров АО';


--
-- Name: COLUMN "REESTRAO".idreestrao; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."REESTRAO".idreestrao IS 'Идентификатор записи';


--
-- Name: COLUMN "REESTRAO".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."REESTRAO".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "REESTRAO".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."REESTRAO".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "REESTRAO".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."REESTRAO".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "REESTRAO".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."REESTRAO".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "REESTRAO".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."REESTRAO".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "REESTRAO".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."REESTRAO".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "REESTRAO".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."REESTRAO".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "REESTRAO".namep; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."REESTRAO".namep IS 'Полное наименование ЮЛ (держателя реестра АО)';


--
-- Name: COLUMN "REESTRAO".ogrn; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."REESTRAO".ogrn IS 'ОГРН держателя реестра';


--
-- Name: COLUMN "REESTRAO".idul; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."REESTRAO".idul IS 'Идентификатор ЮЛ';


--
-- Name: RG; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."RG" (
    idr bigint NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    kod_kl text,
    name text,
    row_check_sum text
);


ALTER TABLE public."RG" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "RG"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."RG" IS 'Справочник "Регионы"';


--
-- Name: COLUMN "RG".idr; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RG".idr IS 'Идентификатор региона';


--
-- Name: COLUMN "RG".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RG".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "RG".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RG".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "RG".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RG".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "RG".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RG".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "RG".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RG".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "RG".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RG".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "RG".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RG".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "RG".kod_kl; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RG".kod_kl IS 'Код по справочнику КЛАДР';


--
-- Name: COLUMN "RG".name; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RG".name IS 'Наименование региона';


--
-- Name: RUL; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."RUL" (
    idrul integer NOT NULL,
    dtogrn timestamp without time zone,
    dtreg timestamp without time zone,
    dtstart timestamp without time zone,
    dom text,
    indeks text,
    korp text,
    kvart text,
    okato text,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    inn text,
    kpp text,
    namep text,
    ogrn text,
    regnumst text,
    row_check_sum text,
    summa bigint,
    idgorod bigint,
    idnasp bigint,
    idraion bigint,
    idregion bigint,
    idstreet bigint,
    idregorg text,
    idul text
);


ALTER TABLE public."RUL" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "RUL"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."RUL" IS 'Сведения об учредителях - российские';


--
-- Name: COLUMN "RUL".idrul; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RUL".idrul IS 'Идентификатор российского ЮЛ';


--
-- Name: COLUMN "RUL".dtogrn; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RUL".dtogrn IS 'Дата присвоения ОГРН';


--
-- Name: COLUMN "RUL".dtreg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RUL".dtreg IS 'Дата регистрации';


--
-- Name: COLUMN "RUL".dtstart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RUL".dtstart IS 'Дата начала действия';


--
-- Name: COLUMN "RUL".dom; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RUL".dom IS 'Дом';


--
-- Name: COLUMN "RUL".indeks; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RUL".indeks IS 'Индекс';


--
-- Name: COLUMN "RUL".korp; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RUL".korp IS 'Корпус';


--
-- Name: COLUMN "RUL".kvart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RUL".kvart IS 'Квартира';


--
-- Name: COLUMN "RUL".okato; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RUL".okato IS 'ОКАТО';


--
-- Name: COLUMN "RUL".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RUL".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "RUL".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RUL".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "RUL".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RUL".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "RUL".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RUL".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "RUL".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RUL".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "RUL".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RUL".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "RUL".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RUL".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "RUL".inn; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RUL".inn IS 'ИНН';


--
-- Name: COLUMN "RUL".kpp; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RUL".kpp IS 'КПП';


--
-- Name: COLUMN "RUL".namep; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RUL".namep IS 'Полное наименование учредителя';


--
-- Name: COLUMN "RUL".ogrn; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RUL".ogrn IS 'ОГРН';


--
-- Name: COLUMN "RUL".regnumst; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RUL".regnumst IS 'Регистрационный номер';


--
-- Name: COLUMN "RUL".summa; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RUL".summa IS 'Размер вклада в уставный капитал';


--
-- Name: COLUMN "RUL".idgorod; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RUL".idgorod IS 'Город (идентификатор)';


--
-- Name: COLUMN "RUL".idnasp; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RUL".idnasp IS 'Населенный пункт (идентификатор)';


--
-- Name: COLUMN "RUL".idraion; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RUL".idraion IS 'Района РФ (идентификатор)';


--
-- Name: COLUMN "RUL".idregion; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RUL".idregion IS 'Регион (идентификатор)';


--
-- Name: COLUMN "RUL".idstreet; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RUL".idstreet IS 'Улица (идентификатор)';


--
-- Name: COLUMN "RUL".idregorg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RUL".idregorg IS 'Идентификатор регистрирующего органа';


--
-- Name: COLUMN "RUL".idul; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RUL".idul IS 'Идентификатор ЮЛ';


--
-- Name: SPDOKDN; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."SPDOKDN" (
    id integer NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    name text,
    row_check_sum text
);


ALTER TABLE public."SPDOKDN" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "SPDOKDN"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."SPDOKDN" IS 'Справочник "Вид документа, подтвержд. приобретение дееспособности"';


--
-- Name: COLUMN "SPDOKDN".id; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPDOKDN".id IS 'ID';


--
-- Name: COLUMN "SPDOKDN".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPDOKDN".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "SPDOKDN".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPDOKDN".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "SPDOKDN".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPDOKDN".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "SPDOKDN".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPDOKDN".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "SPDOKDN".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPDOKDN".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "SPDOKDN".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPDOKDN".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "SPDOKDN".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPDOKDN".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "SPDOKDN".name; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPDOKDN".name IS 'Наименование документа';


--
-- Name: SPFOMS; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."SPFOMS" (
    id integer NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    kod text,
    name text,
    row_check_sum text
);


ALTER TABLE public."SPFOMS" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "SPFOMS"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."SPFOMS" IS 'Справочник "Территориальные органы медицинского страхования"';


--
-- Name: COLUMN "SPFOMS".id; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPFOMS".id IS 'Идентификатор записи';


--
-- Name: COLUMN "SPFOMS".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPFOMS".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "SPFOMS".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPFOMS".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "SPFOMS".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPFOMS".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "SPFOMS".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPFOMS".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "SPFOMS".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPFOMS".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "SPFOMS".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPFOMS".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "SPFOMS".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPFOMS".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "SPFOMS".kod; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPFOMS".kod IS 'Код органа';


--
-- Name: COLUMN "SPFOMS".name; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPFOMS".name IS 'Наименование органа';


--
-- Name: SPFSS; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."SPFSS" (
    id integer NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    kod text,
    name text,
    row_check_sum text
);


ALTER TABLE public."SPFSS" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "SPFSS"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."SPFSS" IS 'Справочник "Территориальные органы соц. страхования"';


--
-- Name: COLUMN "SPFSS".id; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPFSS".id IS 'Идентификатор записи';


--
-- Name: COLUMN "SPFSS".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPFSS".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "SPFSS".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPFSS".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "SPFSS".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPFSS".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "SPFSS".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPFSS".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "SPFSS".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPFSS".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "SPFSS".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPFSS".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "SPFSS".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPFSS".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "SPFSS".kod; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPFSS".kod IS 'Код органа';


--
-- Name: COLUMN "SPFSS".name; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPFSS".name IS 'Наименование органа';


--
-- Name: SPIPSTAT; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."SPIPSTAT" (
    id integer NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    name text,
    row_check_sum text
);


ALTER TABLE public."SPIPSTAT" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "SPIPSTAT"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."SPIPSTAT" IS 'Справочник "Состояния ИП"';


--
-- Name: COLUMN "SPIPSTAT".id; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPIPSTAT".id IS 'ID';


--
-- Name: COLUMN "SPIPSTAT".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPIPSTAT".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "SPIPSTAT".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPIPSTAT".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "SPIPSTAT".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPIPSTAT".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "SPIPSTAT".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPIPSTAT".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "SPIPSTAT".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPIPSTAT".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "SPIPSTAT".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPIPSTAT".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "SPIPSTAT".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPIPSTAT".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "SPIPSTAT".name; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPIPSTAT".name IS 'Состояние ИП';


--
-- Name: SPLANG; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."SPLANG" (
    id integer NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    kod_lang text,
    name text,
    row_check_sum text
);


ALTER TABLE public."SPLANG" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "SPLANG"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."SPLANG" IS 'Справочник "Языки мира"';


--
-- Name: COLUMN "SPLANG".id; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPLANG".id IS 'Идентификатор записи';


--
-- Name: COLUMN "SPLANG".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPLANG".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "SPLANG".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPLANG".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "SPLANG".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPLANG".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "SPLANG".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPLANG".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "SPLANG".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPLANG".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "SPLANG".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPLANG".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "SPLANG".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPLANG".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "SPLANG".kod_lang; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPLANG".kod_lang IS 'Код языка по классификатору ОК';


--
-- Name: COLUMN "SPLANG".name; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPLANG".name IS 'Название языка';


--
-- Name: SPLICORG; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."SPLICORG" (
    id text NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    name text,
    row_check_sum text
);


ALTER TABLE public."SPLICORG" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "SPLICORG"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."SPLICORG" IS 'Справочник "Лицензирующие органы"';


--
-- Name: COLUMN "SPLICORG".id; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPLICORG".id IS 'Идентификатор записи';


--
-- Name: COLUMN "SPLICORG".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPLICORG".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "SPLICORG".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPLICORG".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "SPLICORG".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPLICORG".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "SPLICORG".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPLICORG".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "SPLICORG".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPLICORG".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "SPLICORG".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPLICORG".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "SPLICORG".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPLICORG".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "SPLICORG".name; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPLICORG".name IS 'Наименование лицензирующего органа';


--
-- Name: SPMNS; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."SPMNS" (
    id integer NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    kod text,
    name text,
    row_check_sum text
);


ALTER TABLE public."SPMNS" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "SPMNS"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."SPMNS" IS 'Справочник "Территориальные органы налоговой службы"';


--
-- Name: COLUMN "SPMNS".id; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPMNS".id IS 'Идентификатор записи';


--
-- Name: COLUMN "SPMNS".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPMNS".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "SPMNS".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPMNS".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "SPMNS".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPMNS".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "SPMNS".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPMNS".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "SPMNS".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPMNS".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "SPMNS".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPMNS".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "SPMNS".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPMNS".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "SPMNS".kod; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPMNS".kod IS 'Код органа (по справочнику СОУН)';


--
-- Name: COLUMN "SPMNS".name; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPMNS".name IS 'Наименование органа';


--
-- Name: SPOPF; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."SPOPF" (
    idopf integer NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    kod_opf text,
    name text,
    row_check_sum text,
    spr text
);


ALTER TABLE public."SPOPF" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "SPOPF"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."SPOPF" IS 'Справочник "Организационно-правовые формы"';


--
-- Name: COLUMN "SPOPF".idopf; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPOPF".idopf IS 'Идентификатор записи';


--
-- Name: COLUMN "SPOPF".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPOPF".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "SPOPF".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPOPF".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "SPOPF".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPOPF".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "SPOPF".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPOPF".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "SPOPF".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPOPF".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "SPOPF".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPOPF".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "SPOPF".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPOPF".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "SPOPF".kod_opf; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPOPF".kod_opf IS 'Код по справочнику ОКОПФ или КОПФ';


--
-- Name: COLUMN "SPOPF".name; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPOPF".name IS 'Наименование ОПФ';


--
-- Name: COLUMN "SPOPF".spr; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPOPF".spr IS 'Служебный признак';


--
-- Name: SPOSNDN; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."SPOSNDN" (
    id integer NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    name text,
    row_check_sum text
);


ALTER TABLE public."SPOSNDN" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "SPOSNDN"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."SPOSNDN" IS 'Справочник "Основания приобретения дееспособности"';


--
-- Name: COLUMN "SPOSNDN".id; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPOSNDN".id IS 'ID';


--
-- Name: COLUMN "SPOSNDN".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPOSNDN".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "SPOSNDN".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPOSNDN".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "SPOSNDN".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPOSNDN".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "SPOSNDN".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPOSNDN".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "SPOSNDN".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPOSNDN".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "SPOSNDN".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPOSNDN".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "SPOSNDN".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPOSNDN".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "SPOSNDN".name; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPOSNDN".name IS 'Наименование вида основания';


--
-- Name: SPPF; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."SPPF" (
    id integer NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    kod text,
    name text,
    row_check_sum text
);


ALTER TABLE public."SPPF" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "SPPF"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."SPPF" IS 'Справочник "Территориальные органы Пенсионного фонда"';


--
-- Name: COLUMN "SPPF".id; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPPF".id IS 'Идентификатор записи';


--
-- Name: COLUMN "SPPF".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPPF".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "SPPF".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPPF".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "SPPF".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPPF".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "SPPF".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPPF".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "SPPF".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPPF".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "SPPF".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPPF".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "SPPF".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPPF".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "SPPF".kod; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPPF".kod IS 'Код органа';


--
-- Name: COLUMN "SPPF".name; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPPF".name IS 'Наименование органа';


--
-- Name: SPREGORG; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."SPREGORG" (
    idspro text NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    id_raion integer,
    name text,
    row_check_sum text
);


ALTER TABLE public."SPREGORG" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "SPREGORG"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."SPREGORG" IS 'Справочник "Регистрирующие органы"';


--
-- Name: COLUMN "SPREGORG".idspro; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPREGORG".idspro IS 'Идентификатор записи';


--
-- Name: COLUMN "SPREGORG".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPREGORG".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "SPREGORG".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPREGORG".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "SPREGORG".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPREGORG".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "SPREGORG".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPREGORG".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "SPREGORG".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPREGORG".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "SPREGORG".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPREGORG".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "SPREGORG".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPREGORG".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "SPREGORG".id_raion; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPREGORG".id_raion IS 'Код района СПб';


--
-- Name: COLUMN "SPREGORG".name; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPREGORG".name IS 'Наименование регистрирующего органа';


--
-- Name: SPSOSTLIC; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."SPSOSTLIC" (
    idsostlic integer NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    name text,
    row_check_sum text
);


ALTER TABLE public."SPSOSTLIC" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "SPSOSTLIC"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."SPSOSTLIC" IS 'Справочник "Статус лицензии"';


--
-- Name: COLUMN "SPSOSTLIC".idsostlic; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPSOSTLIC".idsostlic IS 'Идентификатор записи';


--
-- Name: COLUMN "SPSOSTLIC".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPSOSTLIC".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "SPSOSTLIC".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPSOSTLIC".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "SPSOSTLIC".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPSOSTLIC".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "SPSOSTLIC".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPSOSTLIC".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "SPSOSTLIC".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPSOSTLIC".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "SPSOSTLIC".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPSOSTLIC".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "SPSOSTLIC".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPSOSTLIC".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "SPSOSTLIC".name; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPSOSTLIC".name IS 'Статус лицензии';


--
-- Name: SPULSTAT; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."SPULSTAT" (
    id integer NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    name text,
    row_check_sum text
);


ALTER TABLE public."SPULSTAT" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "SPULSTAT"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."SPULSTAT" IS 'Справочник "Состояния ЮЛ"';


--
-- Name: COLUMN "SPULSTAT".id; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPULSTAT".id IS 'Идентификатор записи';


--
-- Name: COLUMN "SPULSTAT".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPULSTAT".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "SPULSTAT".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPULSTAT".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "SPULSTAT".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPULSTAT".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "SPULSTAT".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPULSTAT".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "SPULSTAT".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPULSTAT".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "SPULSTAT".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPULSTAT".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "SPULSTAT".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPULSTAT".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "SPULSTAT".name; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPULSTAT".name IS 'Состояние ЮЛ';


--
-- Name: SPVIDADR; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."SPVIDADR" (
    id integer NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    name text,
    row_check_sum text
);


ALTER TABLE public."SPVIDADR" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "SPVIDADR"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."SPVIDADR" IS 'Справочник "Типы адресов ЮЛ"';


--
-- Name: COLUMN "SPVIDADR".id; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDADR".id IS 'Идентификатор записи';


--
-- Name: COLUMN "SPVIDADR".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDADR".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "SPVIDADR".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDADR".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "SPVIDADR".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDADR".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "SPVIDADR".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDADR".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "SPVIDADR".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDADR".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "SPVIDADR".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDADR".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "SPVIDADR".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDADR".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "SPVIDADR".name; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDADR".name IS 'Тип адреса ЮЛ';


--
-- Name: SPVIDCAP; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."SPVIDCAP" (
    id integer NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    name text,
    row_check_sum text
);


ALTER TABLE public."SPVIDCAP" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "SPVIDCAP"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."SPVIDCAP" IS 'Справочник "Виды уставного капитала"';


--
-- Name: COLUMN "SPVIDCAP".id; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDCAP".id IS 'Идентификатор записи';


--
-- Name: COLUMN "SPVIDCAP".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDCAP".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "SPVIDCAP".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDCAP".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "SPVIDCAP".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDCAP".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "SPVIDCAP".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDCAP".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "SPVIDCAP".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDCAP".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "SPVIDCAP".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDCAP".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "SPVIDCAP".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDCAP".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "SPVIDCAP".name; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDCAP".name IS 'Вид уставного капитала';


--
-- Name: SPVIDCITIZEN; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."SPVIDCITIZEN" (
    id integer NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    name text,
    row_check_sum text
);


ALTER TABLE public."SPVIDCITIZEN" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "SPVIDCITIZEN"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."SPVIDCITIZEN" IS 'Справочник "Вид гражданства ИП"';


--
-- Name: COLUMN "SPVIDCITIZEN".id; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDCITIZEN".id IS 'ID';


--
-- Name: COLUMN "SPVIDCITIZEN".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDCITIZEN".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "SPVIDCITIZEN".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDCITIZEN".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "SPVIDCITIZEN".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDCITIZEN".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "SPVIDCITIZEN".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDCITIZEN".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "SPVIDCITIZEN".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDCITIZEN".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "SPVIDCITIZEN".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDCITIZEN".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "SPVIDCITIZEN".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDCITIZEN".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "SPVIDCITIZEN".name; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDCITIZEN".name IS 'Вид гражданства';


--
-- Name: SPVIDIP; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."SPVIDIP" (
    id integer NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    name text,
    row_check_sum text
);


ALTER TABLE public."SPVIDIP" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "SPVIDIP"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."SPVIDIP" IS 'Справочник "Вид ИП"';


--
-- Name: COLUMN "SPVIDIP".id; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDIP".id IS 'ID';


--
-- Name: COLUMN "SPVIDIP".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDIP".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "SPVIDIP".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDIP".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "SPVIDIP".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDIP".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "SPVIDIP".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDIP".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "SPVIDIP".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDIP".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "SPVIDIP".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDIP".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "SPVIDIP".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDIP".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "SPVIDIP".name; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDIP".name IS 'Наименование вида';


--
-- Name: SPVIDLIC; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."SPVIDLIC" (
    idvidlic bigint NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    name text,
    row_check_sum text
);


ALTER TABLE public."SPVIDLIC" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "SPVIDLIC"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."SPVIDLIC" IS 'Справочник "Виды деятельности лицензий"';


--
-- Name: COLUMN "SPVIDLIC".idvidlic; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDLIC".idvidlic IS 'Идентификатор записи';


--
-- Name: COLUMN "SPVIDLIC".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDLIC".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "SPVIDLIC".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDLIC".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "SPVIDLIC".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDLIC".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "SPVIDLIC".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDLIC".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "SPVIDLIC".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDLIC".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "SPVIDLIC".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDLIC".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "SPVIDLIC".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDLIC".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "SPVIDLIC".name; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDLIC".name IS 'Наименование вида деятельности';


--
-- Name: SPVIDREG; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."SPVIDREG" (
    idvidreg integer NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    name text,
    row_check_sum text
);


ALTER TABLE public."SPVIDREG" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "SPVIDREG"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."SPVIDREG" IS 'Справочник "Вид регистрации"';


--
-- Name: COLUMN "SPVIDREG".idvidreg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDREG".idvidreg IS 'Идентификатор записи';


--
-- Name: COLUMN "SPVIDREG".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDREG".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "SPVIDREG".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDREG".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "SPVIDREG".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDREG".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "SPVIDREG".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDREG".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "SPVIDREG".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDREG".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "SPVIDREG".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDREG".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "SPVIDREG".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDREG".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "SPVIDREG".name; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPVIDREG".name IS 'Вид регистрации';


--
-- Name: ST; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."ST" (
    ids bigint NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    id_prefiks integer,
    kod_st text,
    name text,
    row_check_sum text
);


ALTER TABLE public."ST" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "ST"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."ST" IS 'Справочник "Улицы"';


--
-- Name: COLUMN "ST".ids; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ST".ids IS 'Идентификатор улицы';


--
-- Name: COLUMN "ST".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ST".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "ST".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ST".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "ST".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ST".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "ST".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ST".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "ST".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ST".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "ST".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ST".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "ST".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ST".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "ST".id_prefiks; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ST".id_prefiks IS 'Код префикса (АИСТО)';


--
-- Name: COLUMN "ST".kod_st; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ST".kod_st IS 'Код по справочнику КЛАДР';


--
-- Name: COLUMN "ST".name; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ST".name IS 'Название улицы';


--
-- Name: UL; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."UL" (
    idul text NOT NULL,
    dtregend timestamp without time zone,
    dtregstart timestamp without time zone,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    id_raion integer,
    inn text,
    kpp text,
    ogrn text,
    regnumend text,
    regnumstart text,
    row_check_sum text,
    idregorg text,
    idregorgend text,
    idregorgstart text,
    idstatus integer,
    idvidregend integer,
    idvidregstart integer
);


ALTER TABLE public."UL" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "UL"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."UL" IS 'Юридические лица';


--
-- Name: COLUMN "UL".idul; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL".idul IS 'Идентификатор ЮЛ в базе данных';


--
-- Name: COLUMN "UL".dtregend; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL".dtregend IS 'Дата ликвидации ЮЛ';


--
-- Name: COLUMN "UL".dtregstart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL".dtregstart IS 'Дата создания ЮЛ';


--
-- Name: COLUMN "UL".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "UL".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "UL".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "UL".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "UL".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "UL".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "UL".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "UL".id_raion; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL".id_raion IS 'Код района СПб';


--
-- Name: COLUMN "UL".inn; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL".inn IS 'ИНН';


--
-- Name: COLUMN "UL".kpp; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL".kpp IS 'КПП';


--
-- Name: COLUMN "UL".ogrn; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL".ogrn IS 'ОГРН';


--
-- Name: COLUMN "UL".regnumend; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL".regnumend IS 'Регистрационный номер записи';


--
-- Name: COLUMN "UL".regnumstart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL".regnumstart IS 'ОГРН или Рег. номер для ЮЛ, созданных до 01.07.2002';


--
-- Name: COLUMN "UL".idregorg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL".idregorg IS 'Регистрирующий орган (идентификатор)';


--
-- Name: COLUMN "UL".idregorgend; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL".idregorgend IS 'Рег. орган, зарегистр. прекращение деятельности ЮЛ';


--
-- Name: COLUMN "UL".idregorgstart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL".idregorgstart IS 'Рег. орган, зарегистрировавший создание ЮЛ';


--
-- Name: COLUMN "UL".idstatus; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL".idstatus IS 'Статус ЮЛ (идентификатор)';


--
-- Name: COLUMN "UL".idvidregend; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL".idvidregend IS 'Способ прекращения деятельности';


--
-- Name: COLUMN "UL".idvidregstart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL".idvidregstart IS 'Способ образования ЮЛ (идентификатор)';


--
-- Name: ULADR; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."ULADR" (
    iduladr integer NOT NULL,
    address text,
    dtstart timestamp without time zone,
    fax text,
    dom text,
    indeks text,
    korp text,
    kvart text,
    okato text,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    kodgorod text,
    nameisporg text,
    row_check_sum text,
    telefon text,
    idgorod bigint,
    idnasp bigint,
    idraion bigint,
    idregion bigint,
    idstreet bigint,
    idul text,
    idvidadr integer
);


ALTER TABLE public."ULADR" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "ULADR"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."ULADR" IS 'Адреса ЮЛ';


--
-- Name: COLUMN "ULADR".iduladr; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULADR".iduladr IS 'Идентификатор записи';


--
-- Name: COLUMN "ULADR".dtstart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULADR".dtstart IS 'Дата начала действия записи';


--
-- Name: COLUMN "ULADR".fax; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULADR".fax IS 'Факс';


--
-- Name: COLUMN "ULADR".dom; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULADR".dom IS 'Дом';


--
-- Name: COLUMN "ULADR".indeks; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULADR".indeks IS 'Индекс';


--
-- Name: COLUMN "ULADR".korp; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULADR".korp IS 'Корпус';


--
-- Name: COLUMN "ULADR".kvart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULADR".kvart IS 'Квартира';


--
-- Name: COLUMN "ULADR".okato; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULADR".okato IS 'ОКАТО';


--
-- Name: COLUMN "ULADR".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULADR".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "ULADR".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULADR".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "ULADR".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULADR".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "ULADR".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULADR".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "ULADR".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULADR".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "ULADR".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULADR".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "ULADR".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULADR".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "ULADR".kodgorod; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULADR".kodgorod IS 'Код города (телефонный)';


--
-- Name: COLUMN "ULADR".nameisporg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULADR".nameisporg IS 'Наименование органа, адрес которого является адресом (местом нахождения) ЮЛ';


--
-- Name: COLUMN "ULADR".telefon; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULADR".telefon IS 'Телефон';


--
-- Name: COLUMN "ULADR".idgorod; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULADR".idgorod IS 'Город (идентификатор)';


--
-- Name: COLUMN "ULADR".idnasp; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULADR".idnasp IS 'Населенный пункт (идентификатор)';


--
-- Name: COLUMN "ULADR".idraion; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULADR".idraion IS 'Район РФ (идентификатор)';


--
-- Name: COLUMN "ULADR".idregion; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULADR".idregion IS 'Регион (идентификатор)';


--
-- Name: COLUMN "ULADR".idstreet; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULADR".idstreet IS 'Улица (идентификатор)';


--
-- Name: COLUMN "ULADR".idul; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULADR".idul IS 'Идентификатор ЮЛ';


--
-- Name: COLUMN "ULADR".idvidadr; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULADR".idvidadr IS 'Вид адреса (идентификатор)';


--
-- Name: ULCAPITAL; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."ULCAPITAL" (
    idulcapital integer NOT NULL,
    dtstart timestamp without time zone,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    row_check_sum text,
    summa bigint,
    idul text,
    idvidcap integer
);


ALTER TABLE public."ULCAPITAL" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "ULCAPITAL"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."ULCAPITAL" IS 'Уставные капиталы ЮЛ';


--
-- Name: COLUMN "ULCAPITAL".idulcapital; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULCAPITAL".idulcapital IS 'Идентификатор записи';


--
-- Name: COLUMN "ULCAPITAL".dtstart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULCAPITAL".dtstart IS 'Дата начала действия записи';


--
-- Name: COLUMN "ULCAPITAL".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULCAPITAL".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "ULCAPITAL".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULCAPITAL".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "ULCAPITAL".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULCAPITAL".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "ULCAPITAL".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULCAPITAL".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "ULCAPITAL".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULCAPITAL".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "ULCAPITAL".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULCAPITAL".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "ULCAPITAL".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULCAPITAL".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "ULCAPITAL".summa; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULCAPITAL".summa IS 'Размер уставного капитала (в рублях)';


--
-- Name: COLUMN "ULCAPITAL".idul; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULCAPITAL".idul IS 'Идентификатор ЮЛ';


--
-- Name: COLUMN "ULCAPITAL".idvidcap; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULCAPITAL".idvidcap IS 'Вид уставного капитала (идентификатор)';


--
-- Name: ULFOMS; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."ULFOMS" (
    idulfoms integer NOT NULL,
    dtend timestamp without time zone,
    dtstart timestamp without time zone,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    regnom_foms text,
    row_check_sum text,
    idfoms integer,
    idul text
);


ALTER TABLE public."ULFOMS" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "ULFOMS"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."ULFOMS" IS 'Сведения о регистрации ЮЛ в отделениях ФОМС';


--
-- Name: COLUMN "ULFOMS".idulfoms; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULFOMS".idulfoms IS 'Идентификатор записи';


--
-- Name: COLUMN "ULFOMS".dtend; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULFOMS".dtend IS 'Дата снятия с учета';


--
-- Name: COLUMN "ULFOMS".dtstart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULFOMS".dtstart IS 'Дата постановки на учет';


--
-- Name: COLUMN "ULFOMS".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULFOMS".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "ULFOMS".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULFOMS".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "ULFOMS".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULFOMS".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "ULFOMS".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULFOMS".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "ULFOMS".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULFOMS".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "ULFOMS".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULFOMS".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "ULFOMS".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULFOMS".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "ULFOMS".regnom_foms; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULFOMS".regnom_foms IS 'Регистрационный номер в фонде';


--
-- Name: COLUMN "ULFOMS".idfoms; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULFOMS".idfoms IS 'ФОМС (идентификатор)';


--
-- Name: COLUMN "ULFOMS".idul; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULFOMS".idul IS 'Идентификатор ЮЛ';


--
-- Name: ULFSS; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."ULFSS" (
    idulfss integer NOT NULL,
    dtend timestamp without time zone,
    dtstart timestamp without time zone,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    regnom_fss text,
    row_check_sum text,
    idfss integer,
    idul text
);


ALTER TABLE public."ULFSS" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "ULFSS"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."ULFSS" IS 'Сведения о регистрации ЮЛ в отделениях ФСС';


--
-- Name: COLUMN "ULFSS".idulfss; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULFSS".idulfss IS 'Идентификатор записи';


--
-- Name: COLUMN "ULFSS".dtend; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULFSS".dtend IS 'Дата снятия с учета';


--
-- Name: COLUMN "ULFSS".dtstart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULFSS".dtstart IS 'Дата постановки на учет';


--
-- Name: COLUMN "ULFSS".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULFSS".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "ULFSS".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULFSS".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "ULFSS".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULFSS".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "ULFSS".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULFSS".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "ULFSS".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULFSS".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "ULFSS".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULFSS".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "ULFSS".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULFSS".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "ULFSS".regnom_fss; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULFSS".regnom_fss IS 'Реестровый номер в фонде';


--
-- Name: COLUMN "ULFSS".idfss; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULFSS".idfss IS 'ФСС (идентификатор)';


--
-- Name: COLUMN "ULFSS".idul; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULFSS".idul IS 'Идентификатор ЮЛ';


--
-- Name: ULMNS; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."ULMNS" (
    idulmns integer NOT NULL,
    dtend timestamp without time zone,
    dtstart timestamp without time zone,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    row_check_sum text,
    idmns integer,
    idul text
);


ALTER TABLE public."ULMNS" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "ULMNS"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."ULMNS" IS 'Сведения о постановке ЮЛ на учет в МНС';


--
-- Name: COLUMN "ULMNS".idulmns; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULMNS".idulmns IS 'Идентификатор записи';


--
-- Name: COLUMN "ULMNS".dtend; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULMNS".dtend IS 'Дата снятия с учета';


--
-- Name: COLUMN "ULMNS".dtstart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULMNS".dtstart IS 'Дата постановки на учет';


--
-- Name: COLUMN "ULMNS".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULMNS".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "ULMNS".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULMNS".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "ULMNS".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULMNS".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "ULMNS".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULMNS".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "ULMNS".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULMNS".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "ULMNS".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULMNS".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "ULMNS".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULMNS".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "ULMNS".idmns; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULMNS".idmns IS 'Налоговый орган (идентификатор)';


--
-- Name: COLUMN "ULMNS".idul; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULMNS".idul IS 'Идентификатор ЮЛ';


--
-- Name: ULNAME; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."ULNAME" (
    idulname integer NOT NULL,
    dtstart timestamp without time zone,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    namei text,
    namep text,
    names text,
    row_check_sum text,
    idlangi integer,
    idopf integer,
    idul text
);


ALTER TABLE public."ULNAME" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "ULNAME"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."ULNAME" IS 'Наименования ЮЛ';


--
-- Name: COLUMN "ULNAME".idulname; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULNAME".idulname IS 'Идентификатор записи';


--
-- Name: COLUMN "ULNAME".dtstart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULNAME".dtstart IS 'Дата начала действия записи';


--
-- Name: COLUMN "ULNAME".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULNAME".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "ULNAME".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULNAME".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "ULNAME".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULNAME".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "ULNAME".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULNAME".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "ULNAME".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULNAME".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "ULNAME".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULNAME".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "ULNAME".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULNAME".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "ULNAME".namei; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULNAME".namei IS 'Наименование ЮЛ на иностранном';


--
-- Name: COLUMN "ULNAME".namep; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULNAME".namep IS 'Полное наименование юридического лица';


--
-- Name: COLUMN "ULNAME".names; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULNAME".names IS 'Сокращенное наименование ЮЛ';


--
-- Name: COLUMN "ULNAME".idlangi; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULNAME".idlangi IS 'Иностранный язык (идентификатор)';


--
-- Name: COLUMN "ULNAME".idopf; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULNAME".idopf IS 'ОПФ (идентификатор)';


--
-- Name: COLUMN "ULNAME".idul; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULNAME".idul IS 'Идентификатор ЮЛ';


--
-- Name: ULNAME_FULL; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."ULNAME_FULL" (
    idulname integer NOT NULL,
    full_name text NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    idul integer NOT NULL,
    row_check_sum text
);


ALTER TABLE public."ULNAME_FULL" OWNER TO "EGRUL_DEV2";

--
-- Name: COLUMN "ULNAME_FULL".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULNAME_FULL".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "ULNAME_FULL".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULNAME_FULL".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "ULNAME_FULL".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULNAME_FULL".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "ULNAME_FULL".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULNAME_FULL".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "ULNAME_FULL".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULNAME_FULL".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "ULNAME_FULL".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULNAME_FULL".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "ULNAME_FULL".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULNAME_FULL".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: ULOB; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."ULOB" (
    idulob integer NOT NULL,
    dtstart timestamp without time zone,
    fax text,
    dom text,
    indeks text,
    korp text,
    kvart text,
    okato text,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    kodgorod text,
    row_check_sum text,
    telefon text,
    vidob integer,
    idgorod bigint,
    idnasp bigint,
    idraion bigint,
    idregion bigint,
    idstreet bigint,
    idul text
);


ALTER TABLE public."ULOB" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "ULOB"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."ULOB" IS 'Обособленные подразделения ЮЛ';


--
-- Name: COLUMN "ULOB".idulob; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOB".idulob IS 'Идентификатор записи';


--
-- Name: COLUMN "ULOB".dtstart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOB".dtstart IS 'Дата начала действия записи';


--
-- Name: COLUMN "ULOB".fax; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOB".fax IS 'Факс';


--
-- Name: COLUMN "ULOB".dom; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOB".dom IS 'Дом';


--
-- Name: COLUMN "ULOB".indeks; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOB".indeks IS 'Индекс';


--
-- Name: COLUMN "ULOB".korp; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOB".korp IS 'Корпус';


--
-- Name: COLUMN "ULOB".kvart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOB".kvart IS 'Квартира';


--
-- Name: COLUMN "ULOB".okato; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOB".okato IS 'ОКАТО';


--
-- Name: COLUMN "ULOB".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOB".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "ULOB".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOB".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "ULOB".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOB".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "ULOB".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOB".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "ULOB".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOB".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "ULOB".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOB".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "ULOB".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOB".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "ULOB".kodgorod; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOB".kodgorod IS 'Код города (телефонный)';


--
-- Name: COLUMN "ULOB".telefon; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOB".telefon IS 'Телефон';


--
-- Name: COLUMN "ULOB".vidob; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOB".vidob IS 'Код вида подразделения';


--
-- Name: COLUMN "ULOB".idgorod; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOB".idgorod IS 'Город (идентификатор)';


--
-- Name: COLUMN "ULOB".idnasp; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOB".idnasp IS 'Населенный пункт (идентификатор)';


--
-- Name: COLUMN "ULOB".idraion; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOB".idraion IS 'Район РФ (идентификатор)';


--
-- Name: COLUMN "ULOB".idregion; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOB".idregion IS 'Регион (идентификатор)';


--
-- Name: COLUMN "ULOB".idstreet; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOB".idstreet IS 'Улица (идентификатор)';


--
-- Name: COLUMN "ULOB".idul; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOB".idul IS 'Идентификатор ЮЛ';


--
-- Name: ULOKVED; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."ULOKVED" (
    idulokved integer NOT NULL,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    main integer,
    row_check_sum text,
    idokved integer,
    idul text
);


ALTER TABLE public."ULOKVED" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "ULOKVED"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."ULOKVED" IS 'Виды экономической деятельности ЮЛ';


--
-- Name: COLUMN "ULOKVED".idulokved; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOKVED".idulokved IS 'Идентификатор записи';


--
-- Name: COLUMN "ULOKVED".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOKVED".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "ULOKVED".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOKVED".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "ULOKVED".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOKVED".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "ULOKVED".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOKVED".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "ULOKVED".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOKVED".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "ULOKVED".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOKVED".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "ULOKVED".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOKVED".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "ULOKVED".main; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOKVED".main IS 'Признак "Основной вид деятельности';


--
-- Name: COLUMN "ULOKVED".idokved; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOKVED".idokved IS 'Идентификатор вида деятельности';


--
-- Name: COLUMN "ULOKVED".idul; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULOKVED".idul IS 'Идентификатор ЮЛ';


--
-- Name: ULPF; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."ULPF" (
    idulpf integer NOT NULL,
    dtend timestamp without time zone,
    dtstart timestamp without time zone,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    regnom_pf text,
    row_check_sum text,
    idpf integer,
    idul text
);


ALTER TABLE public."ULPF" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "ULPF"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."ULPF" IS 'Сведения о регистрации ЮЛ в ПФ';


--
-- Name: COLUMN "ULPF".idulpf; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPF".idulpf IS 'Идентификатор записи';


--
-- Name: COLUMN "ULPF".dtend; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPF".dtend IS 'Дата снятия с учета';


--
-- Name: COLUMN "ULPF".dtstart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPF".dtstart IS 'Дата постановки на учет';


--
-- Name: COLUMN "ULPF".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPF".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "ULPF".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPF".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "ULPF".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPF".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "ULPF".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPF".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "ULPF".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPF".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "ULPF".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPF".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "ULPF".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPF".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "ULPF".regnom_pf; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPF".regnom_pf IS 'Регистрационный номер в фонде';


--
-- Name: COLUMN "ULPF".idpf; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPF".idpf IS 'Идентификатор терр. органа ПФ';


--
-- Name: COLUMN "ULPF".idul; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPF".idul IS 'Идентификатор ЮЛ';


--
-- Name: ULPREDSH; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."ULPREDSH" (
    idulpredsh integer NOT NULL,
    dtogrn timestamp without time zone,
    dtreg timestamp without time zone,
    dom text,
    indeks text,
    korp text,
    kvart text,
    okato text,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    inn text,
    kpp text,
    namep text,
    ogrn text,
    regnumst text,
    row_check_sum text,
    idgorod bigint,
    idnasp bigint,
    idraion bigint,
    idregion bigint,
    idstreet bigint,
    idregorg text,
    idul text
);


ALTER TABLE public."ULPREDSH" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "ULPREDSH"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."ULPREDSH" IS 'Предшественники ЮЛ';


--
-- Name: COLUMN "ULPREDSH".idulpredsh; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREDSH".idulpredsh IS 'Идентификатор записи';


--
-- Name: COLUMN "ULPREDSH".dtogrn; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREDSH".dtogrn IS 'Дата присвоения  ОГРН';


--
-- Name: COLUMN "ULPREDSH".dtreg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREDSH".dtreg IS 'Дата регистрации';


--
-- Name: COLUMN "ULPREDSH".dom; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREDSH".dom IS 'Дом';


--
-- Name: COLUMN "ULPREDSH".indeks; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREDSH".indeks IS 'Индекс';


--
-- Name: COLUMN "ULPREDSH".korp; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREDSH".korp IS 'Корпус';


--
-- Name: COLUMN "ULPREDSH".kvart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREDSH".kvart IS 'Квартира';


--
-- Name: COLUMN "ULPREDSH".okato; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREDSH".okato IS 'ОКАТО';


--
-- Name: COLUMN "ULPREDSH".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREDSH".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "ULPREDSH".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREDSH".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "ULPREDSH".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREDSH".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "ULPREDSH".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREDSH".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "ULPREDSH".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREDSH".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "ULPREDSH".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREDSH".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "ULPREDSH".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREDSH".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "ULPREDSH".inn; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREDSH".inn IS 'ИНН';


--
-- Name: COLUMN "ULPREDSH".kpp; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREDSH".kpp IS 'КПП';


--
-- Name: COLUMN "ULPREDSH".namep; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREDSH".namep IS 'Полное наименование предшественника ЮЛ';


--
-- Name: COLUMN "ULPREDSH".ogrn; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREDSH".ogrn IS 'ОГРН';


--
-- Name: COLUMN "ULPREDSH".regnumst; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREDSH".regnumst IS 'Регистрационный номер предшественника ЮЛ';


--
-- Name: COLUMN "ULPREDSH".idgorod; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREDSH".idgorod IS 'Город (идентификатор)';


--
-- Name: COLUMN "ULPREDSH".idnasp; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREDSH".idnasp IS 'Населенный пункт (идентификатор)';


--
-- Name: COLUMN "ULPREDSH".idraion; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREDSH".idraion IS 'Район РФ (идентификатор)';


--
-- Name: COLUMN "ULPREDSH".idregion; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREDSH".idregion IS 'Регион (идентификатор)';


--
-- Name: COLUMN "ULPREDSH".idstreet; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREDSH".idstreet IS 'Улица (идентификатор)';


--
-- Name: COLUMN "ULPREDSH".idregorg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREDSH".idregorg IS 'Регистрирующий орган (идентификатор)';


--
-- Name: COLUMN "ULPREDSH".idul; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREDSH".idul IS 'Идентификатор ЮЛ';


--
-- Name: ULPREEM; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."ULPREEM" (
    idulpreem integer NOT NULL,
    dtogrn timestamp without time zone,
    dtreg timestamp without time zone,
    dom text,
    indeks text,
    korp text,
    kvart text,
    okato text,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    inn text,
    kpp text,
    namep text,
    ogrn text,
    regnumst text,
    row_check_sum text,
    idgorod bigint,
    idnasp bigint,
    idraion bigint,
    idregion bigint,
    idstreet bigint,
    idregorg text,
    idul text
);


ALTER TABLE public."ULPREEM" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "ULPREEM"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."ULPREEM" IS 'Правопреемники ЮЛ';


--
-- Name: COLUMN "ULPREEM".idulpreem; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREEM".idulpreem IS 'Идентификатор записи';


--
-- Name: COLUMN "ULPREEM".dtogrn; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREEM".dtogrn IS 'Дата присвоения ОГРН';


--
-- Name: COLUMN "ULPREEM".dtreg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREEM".dtreg IS 'Дата регистрации';


--
-- Name: COLUMN "ULPREEM".dom; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREEM".dom IS 'Дом';


--
-- Name: COLUMN "ULPREEM".indeks; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREEM".indeks IS 'Индекс';


--
-- Name: COLUMN "ULPREEM".korp; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREEM".korp IS 'Корпус';


--
-- Name: COLUMN "ULPREEM".kvart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREEM".kvart IS 'Квартира';


--
-- Name: COLUMN "ULPREEM".okato; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREEM".okato IS 'ОКАТО';


--
-- Name: COLUMN "ULPREEM".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREEM".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "ULPREEM".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREEM".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "ULPREEM".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREEM".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "ULPREEM".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREEM".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "ULPREEM".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREEM".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "ULPREEM".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREEM".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "ULPREEM".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREEM".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "ULPREEM".inn; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREEM".inn IS 'ИНН';


--
-- Name: COLUMN "ULPREEM".kpp; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREEM".kpp IS 'КПП';


--
-- Name: COLUMN "ULPREEM".namep; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREEM".namep IS 'Полное наименование правопреемника';


--
-- Name: COLUMN "ULPREEM".ogrn; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREEM".ogrn IS 'ОГРН';


--
-- Name: COLUMN "ULPREEM".regnumst; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREEM".regnumst IS 'Рег. номер правопреемника';


--
-- Name: COLUMN "ULPREEM".idgorod; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREEM".idgorod IS 'Город (идентификатор)';


--
-- Name: COLUMN "ULPREEM".idnasp; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREEM".idnasp IS 'Населенный пункт (идентификатор)';


--
-- Name: COLUMN "ULPREEM".idraion; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREEM".idraion IS 'Район РФ (идентификатор)';


--
-- Name: COLUMN "ULPREEM".idregion; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREEM".idregion IS 'Регион (идентификатор)';


--
-- Name: COLUMN "ULPREEM".idstreet; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREEM".idstreet IS 'Улица (идентификатор)';


--
-- Name: COLUMN "ULPREEM".idregorg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREEM".idregorg IS 'Регистрирующий орган (идентификатор)';


--
-- Name: COLUMN "ULPREEM".idul; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPREEM".idul IS 'Идентификатор ЮЛ';


--
-- Name: ULUPR; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."ULUPR" (
    idulupr integer NOT NULL,
    dtreg timestamp without time zone,
    dtstart timestamp without time zone,
    fax text,
    dom text,
    indeks text,
    korp text,
    kvart text,
    okato text,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    inn text,
    kodgorod text,
    kpp text,
    namep text,
    ogrn text,
    row_check_sum text,
    telefon text,
    idgorod bigint,
    idnasp bigint,
    idraion bigint,
    idregion bigint,
    idstreet bigint,
    idul text
);


ALTER TABLE public."ULUPR" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "ULUPR"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."ULUPR" IS 'Сведения об управляющей компании';


--
-- Name: COLUMN "ULUPR".idulupr; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULUPR".idulupr IS 'Идентификатор записи';


--
-- Name: COLUMN "ULUPR".dtreg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULUPR".dtreg IS 'Дата регистрации';


--
-- Name: COLUMN "ULUPR".dtstart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULUPR".dtstart IS 'Дата начала действия записи';


--
-- Name: COLUMN "ULUPR".fax; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULUPR".fax IS 'Факс';


--
-- Name: COLUMN "ULUPR".dom; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULUPR".dom IS 'Дом';


--
-- Name: COLUMN "ULUPR".indeks; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULUPR".indeks IS 'Индекс';


--
-- Name: COLUMN "ULUPR".korp; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULUPR".korp IS 'Корпус';


--
-- Name: COLUMN "ULUPR".kvart; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULUPR".kvart IS 'Квартира';


--
-- Name: COLUMN "ULUPR".okato; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULUPR".okato IS 'ОКАТО';


--
-- Name: COLUMN "ULUPR".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULUPR".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "ULUPR".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULUPR".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "ULUPR".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULUPR".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "ULUPR".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULUPR".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "ULUPR".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULUPR".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "ULUPR".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULUPR".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "ULUPR".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULUPR".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "ULUPR".inn; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULUPR".inn IS 'ИНН';


--
-- Name: COLUMN "ULUPR".kodgorod; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULUPR".kodgorod IS 'Код города (телефонный)';


--
-- Name: COLUMN "ULUPR".kpp; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULUPR".kpp IS 'КПП';


--
-- Name: COLUMN "ULUPR".namep; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULUPR".namep IS 'Полное наименование управляющей компании';


--
-- Name: COLUMN "ULUPR".ogrn; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULUPR".ogrn IS 'ОГРН';


--
-- Name: COLUMN "ULUPR".telefon; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULUPR".telefon IS 'Телефон';


--
-- Name: COLUMN "ULUPR".idgorod; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULUPR".idgorod IS 'Город (идентификатор)';


--
-- Name: COLUMN "ULUPR".idnasp; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULUPR".idnasp IS 'Населенный пункт (идентификатор)';


--
-- Name: COLUMN "ULUPR".idraion; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULUPR".idraion IS 'Район СПб (идентификатор)';


--
-- Name: COLUMN "ULUPR".idregion; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULUPR".idregion IS 'Регион (идентификатор)';


--
-- Name: COLUMN "ULUPR".idstreet; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULUPR".idstreet IS 'Улица (идентификатор)';


--
-- Name: COLUMN "ULUPR".idul; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULUPR".idul IS 'Идентификатор ЮЛ';


--
-- Name: UL_ACTUAL_DATA; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."UL_ACTUAL_DATA" (
    idul integer NOT NULL,
    adr text,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    id_as_current integer,
    idstatus integer,
    iduladr integer,
    idulname integer,
    inn text,
    namep text,
    names text,
    ogrn text,
    row_check_sum text
);


ALTER TABLE public."UL_ACTUAL_DATA" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "UL_ACTUAL_DATA"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."UL_ACTUAL_DATA" IS 'Текущее состояние ЮЛ (используется для быстрого поиска ЮЛ)';


--
-- Name: COLUMN "UL_ACTUAL_DATA".idul; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL_ACTUAL_DATA".idul IS 'IDUL';


--
-- Name: COLUMN "UL_ACTUAL_DATA".adr; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL_ACTUAL_DATA".adr IS 'Строковый адрес (последний)';


--
-- Name: COLUMN "UL_ACTUAL_DATA".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL_ACTUAL_DATA".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "UL_ACTUAL_DATA".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL_ACTUAL_DATA".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "UL_ACTUAL_DATA".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL_ACTUAL_DATA".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "UL_ACTUAL_DATA".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL_ACTUAL_DATA".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "UL_ACTUAL_DATA".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL_ACTUAL_DATA".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "UL_ACTUAL_DATA".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL_ACTUAL_DATA".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "UL_ACTUAL_DATA".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL_ACTUAL_DATA".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "UL_ACTUAL_DATA".id_as_current; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL_ACTUAL_DATA".id_as_current IS 'ID_AS_CURRENT';


--
-- Name: COLUMN "UL_ACTUAL_DATA".idstatus; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL_ACTUAL_DATA".idstatus IS 'ID статуса ЮЛ (спр. SPULSTAT)';


--
-- Name: COLUMN "UL_ACTUAL_DATA".iduladr; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL_ACTUAL_DATA".iduladr IS 'IDULADR для связи с ULADR';


--
-- Name: COLUMN "UL_ACTUAL_DATA".idulname; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL_ACTUAL_DATA".idulname IS 'IDULNAME для связи с ULNAME';


--
-- Name: COLUMN "UL_ACTUAL_DATA".inn; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL_ACTUAL_DATA".inn IS 'ИНН';


--
-- Name: COLUMN "UL_ACTUAL_DATA".namep; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL_ACTUAL_DATA".namep IS 'Наименование полное (последнее)';


--
-- Name: COLUMN "UL_ACTUAL_DATA".names; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL_ACTUAL_DATA".names IS 'Наименование сокращенное (последнее)';


--
-- Name: COLUMN "UL_ACTUAL_DATA".ogrn; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL_ACTUAL_DATA".ogrn IS 'ОГРН';


--
-- Name: XML_LOAD_LOG; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."XML_LOAD_LOG" (
    idxml integer NOT NULL,
    date_load timestamp without time zone,
    gihd__a_id_package integer,
    gihd__adate timestamp without time zone,
    gihd__ch_id_package integer,
    gihd__chdate timestamp without time zone,
    gihd__d_id_package integer,
    gihd__ddate timestamp without time zone,
    gihd__id_user integer,
    row_check_sum text,
    xml_name text
);


ALTER TABLE public."XML_LOAD_LOG" OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE "XML_LOAD_LOG"; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON TABLE public."XML_LOAD_LOG" IS 'Перечень загруженных XML-пакет';


--
-- Name: COLUMN "XML_LOAD_LOG".idxml; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."XML_LOAD_LOG".idxml IS 'Идентификатор';


--
-- Name: COLUMN "XML_LOAD_LOG".date_load; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."XML_LOAD_LOG".date_load IS 'Дата загрузки';


--
-- Name: COLUMN "XML_LOAD_LOG".gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."XML_LOAD_LOG".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN "XML_LOAD_LOG".gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."XML_LOAD_LOG".gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN "XML_LOAD_LOG".gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."XML_LOAD_LOG".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN "XML_LOAD_LOG".gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."XML_LOAD_LOG".gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN "XML_LOAD_LOG".gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."XML_LOAD_LOG".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN "XML_LOAD_LOG".gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."XML_LOAD_LOG".gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN "XML_LOAD_LOG".gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."XML_LOAD_LOG".gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: COLUMN "XML_LOAD_LOG".xml_name; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."XML_LOAD_LOG".xml_name IS 'Имя XML-пакета';


--
-- Name: seq_cn; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_cn
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_cn OWNER TO "EGRUL_DEV2";

--
-- Name: seq_cn; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_cn OWNED BY public."CN".idn;


--
-- Name: seq_ct; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_ct
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_ct OWNER TO "EGRUL_DEV2";

--
-- Name: seq_ct; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_ct OWNED BY public."CT".idc;


--
-- Name: seq_ds; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_ds
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_ds OWNER TO "EGRUL_DEV2";

--
-- Name: seq_ds; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_ds OWNED BY public."DS".idd;


--
-- Name: seq_fl; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_fl
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_fl OWNER TO "EGRUL_DEV2";

--
-- Name: seq_fl; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_fl OWNED BY public."FL".idfl;


--
-- Name: seq_fldolgn; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_fldolgn
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_fldolgn OWNER TO "EGRUL_DEV2";

--
-- Name: seq_fldolgn; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_fldolgn OWNED BY public."FLDOLGN".idfldolgn;


--
-- Name: seq_fluchr; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_fluchr
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_fluchr OWNER TO "EGRUL_DEV2";

--
-- Name: seq_fluchr; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_fluchr OWNED BY public."FLUCHR".idfluchr;


--
-- Name: seq_gosreg; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_gosreg
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_gosreg OWNER TO "EGRUL_DEV2";

--
-- Name: seq_gosreg; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_gosreg OWNED BY public."GOSREG".idreg;


--
-- Name: seq_ip; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_ip
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_ip OWNER TO "EGRUL_DEV2";

--
-- Name: seq_ip; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_ip OWNED BY public."IP".idip;


--
-- Name: seq_ipcitizen; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_ipcitizen
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_ipcitizen OWNER TO "EGRUL_DEV2";

--
-- Name: seq_ipcitizen; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_ipcitizen OWNED BY public."IPCITIZEN".idipcitizen;


--
-- Name: seq_ipdokdsn; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_ipdokdsn
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_ipdokdsn OWNER TO "EGRUL_DEV2";

--
-- Name: seq_ipdokdsn; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_ipdokdsn OWNED BY public."IPDOKDSN".iddokdsn;


--
-- Name: seq_ipfoms; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_ipfoms
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_ipfoms OWNER TO "EGRUL_DEV2";

--
-- Name: seq_ipfoms; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_ipfoms OWNED BY public."IPFOMS".idipfoms;


--
-- Name: seq_ipfss; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_ipfss
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_ipfss OWNER TO "EGRUL_DEV2";

--
-- Name: seq_ipfss; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_ipfss OWNED BY public."IPFSS".idipfss;


--
-- Name: seq_ipgosreg; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_ipgosreg
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_ipgosreg OWNER TO "EGRUL_DEV2";

--
-- Name: seq_ipgosreg; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_ipgosreg OWNED BY public."IPGOSREG".idreg;


--
-- Name: seq_ipmns; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_ipmns
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_ipmns OWNER TO "EGRUL_DEV2";

--
-- Name: seq_ipmns; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_ipmns OWNED BY public."IPMNS".idipmns;


--
-- Name: seq_ipname; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_ipname
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_ipname OWNER TO "EGRUL_DEV2";

--
-- Name: seq_ipname; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_ipname OWNED BY public."IPNAME".idipname;


--
-- Name: seq_ipokved; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_ipokved
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_ipokved OWNER TO "EGRUL_DEV2";

--
-- Name: seq_ipokved; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_ipokved OWNED BY public."IPOKVED".idipokved;


--
-- Name: seq_ippf; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_ippf
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_ippf OWNER TO "EGRUL_DEV2";

--
-- Name: seq_ippf; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_ippf OWNED BY public."IPPF".idippf;


--
-- Name: seq_ipregold; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_ipregold
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_ipregold OWNER TO "EGRUL_DEV2";

--
-- Name: seq_ipregold; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_ipregold OWNED BY public."IPREGOLD".idipregold;


--
-- Name: seq_iul; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_iul
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_iul OWNER TO "EGRUL_DEV2";

--
-- Name: seq_iul; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_iul OWNED BY public."IUL".idiul;


--
-- Name: seq_licenz; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_licenz
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_licenz OWNER TO "EGRUL_DEV2";

--
-- Name: seq_licenz; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_licenz OWNED BY public."LICENZ".idlic;


--
-- Name: seq_okato_raion; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_okato_raion
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_okato_raion OWNER TO "EGRUL_DEV2";

--
-- Name: seq_okato_raion; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_okato_raion OWNED BY public."OKATO_RAION".okato;


--
-- Name: seq_oksm; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_oksm
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_oksm OWNER TO "EGRUL_DEV2";

--
-- Name: seq_oksm; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_oksm OWNED BY public."OKSM".id;


--
-- Name: seq_okved; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_okved
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_okved OWNER TO "EGRUL_DEV2";

--
-- Name: seq_okved; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_okved OWNED BY public."OKVED".idokved;


--
-- Name: seq_post_indexes; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_post_indexes
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_post_indexes OWNER TO "EGRUL_DEV2";

--
-- Name: seq_post_indexes; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_post_indexes OWNED BY public."POST_INDEXES".id_post_raion;


--
-- Name: seq_prefiks_raion; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_prefiks_raion
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_prefiks_raion OWNER TO "EGRUL_DEV2";

--
-- Name: seq_prefiks_raion; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_prefiks_raion OWNED BY public."PREFIKS_RAION".id_prefiks;


--
-- Name: seq_raion; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_raion
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_raion OWNER TO "EGRUL_DEV2";

--
-- Name: seq_raion; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_raion OWNED BY public."RAION".id_raion;


--
-- Name: seq_reestrao; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_reestrao
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_reestrao OWNER TO "EGRUL_DEV2";

--
-- Name: seq_reestrao; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_reestrao OWNED BY public."REESTRAO".idreestrao;


--
-- Name: seq_rg; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_rg
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_rg OWNER TO "EGRUL_DEV2";

--
-- Name: seq_rg; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_rg OWNED BY public."RG".idr;


--
-- Name: seq_rul; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_rul
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_rul OWNER TO "EGRUL_DEV2";

--
-- Name: seq_rul; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_rul OWNED BY public."RUL".idrul;


--
-- Name: seq_spdokdn; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_spdokdn
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_spdokdn OWNER TO "EGRUL_DEV2";

--
-- Name: seq_spdokdn; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_spdokdn OWNED BY public."SPDOKDN".id;


--
-- Name: seq_spfoms; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_spfoms
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_spfoms OWNER TO "EGRUL_DEV2";

--
-- Name: seq_spfoms; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_spfoms OWNED BY public."SPFOMS".id;


--
-- Name: seq_spfss; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_spfss
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_spfss OWNER TO "EGRUL_DEV2";

--
-- Name: seq_spfss; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_spfss OWNED BY public."SPFSS".id;


--
-- Name: seq_spipstat; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_spipstat
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_spipstat OWNER TO "EGRUL_DEV2";

--
-- Name: seq_spipstat; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_spipstat OWNED BY public."SPIPSTAT".id;


--
-- Name: seq_splang; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_splang
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_splang OWNER TO "EGRUL_DEV2";

--
-- Name: seq_splang; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_splang OWNED BY public."SPLANG".id;


--
-- Name: seq_splicorg; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_splicorg
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_splicorg OWNER TO "EGRUL_DEV2";

--
-- Name: seq_splicorg; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_splicorg OWNED BY public."SPLICORG".id;


--
-- Name: seq_spmns; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_spmns
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_spmns OWNER TO "EGRUL_DEV2";

--
-- Name: seq_spmns; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_spmns OWNED BY public."SPMNS".id;


--
-- Name: seq_spopf; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_spopf
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_spopf OWNER TO "EGRUL_DEV2";

--
-- Name: seq_spopf; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_spopf OWNED BY public."SPOPF".idopf;


--
-- Name: seq_sposndn; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_sposndn
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_sposndn OWNER TO "EGRUL_DEV2";

--
-- Name: seq_sposndn; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_sposndn OWNED BY public."SPOSNDN".id;


--
-- Name: seq_sppf; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_sppf
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_sppf OWNER TO "EGRUL_DEV2";

--
-- Name: seq_sppf; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_sppf OWNED BY public."SPPF".id;


--
-- Name: seq_spregorg; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_spregorg
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_spregorg OWNER TO "EGRUL_DEV2";

--
-- Name: seq_spregorg; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_spregorg OWNED BY public."SPREGORG".idspro;


--
-- Name: seq_spsostlic; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_spsostlic
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_spsostlic OWNER TO "EGRUL_DEV2";

--
-- Name: seq_spsostlic; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_spsostlic OWNED BY public."SPSOSTLIC".idsostlic;


--
-- Name: seq_spulstat; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_spulstat
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_spulstat OWNER TO "EGRUL_DEV2";

--
-- Name: seq_spulstat; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_spulstat OWNED BY public."SPULSTAT".id;


--
-- Name: seq_spvidadr; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_spvidadr
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_spvidadr OWNER TO "EGRUL_DEV2";

--
-- Name: seq_spvidadr; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_spvidadr OWNED BY public."SPVIDADR".id;


--
-- Name: seq_spvidcap; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_spvidcap
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_spvidcap OWNER TO "EGRUL_DEV2";

--
-- Name: seq_spvidcap; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_spvidcap OWNED BY public."SPVIDCAP".id;


--
-- Name: seq_spvidcitizen; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_spvidcitizen
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_spvidcitizen OWNER TO "EGRUL_DEV2";

--
-- Name: seq_spvidcitizen; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_spvidcitizen OWNED BY public."SPVIDCITIZEN".id;


--
-- Name: seq_spvidip; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_spvidip
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_spvidip OWNER TO "EGRUL_DEV2";

--
-- Name: seq_spvidip; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_spvidip OWNED BY public."SPVIDIP".id;


--
-- Name: seq_spvidlic; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_spvidlic
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_spvidlic OWNER TO "EGRUL_DEV2";

--
-- Name: seq_spvidlic; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_spvidlic OWNED BY public."SPVIDLIC".idvidlic;


--
-- Name: seq_spvidreg; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_spvidreg
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_spvidreg OWNER TO "EGRUL_DEV2";

--
-- Name: seq_spvidreg; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_spvidreg OWNED BY public."SPVIDREG".idvidreg;


--
-- Name: seq_st; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_st
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_st OWNER TO "EGRUL_DEV2";

--
-- Name: seq_st; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_st OWNED BY public."ST".ids;


--
-- Name: seq_ul; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_ul
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_ul OWNER TO "EGRUL_DEV2";

--
-- Name: seq_ul; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_ul OWNED BY public."UL".idul;


--
-- Name: seq_ul_actual_data; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_ul_actual_data
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_ul_actual_data OWNER TO "EGRUL_DEV2";

--
-- Name: seq_ul_actual_data; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_ul_actual_data OWNED BY public."UL_ACTUAL_DATA".idul;


--
-- Name: seq_uladr; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_uladr
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_uladr OWNER TO "EGRUL_DEV2";

--
-- Name: seq_uladr; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_uladr OWNED BY public."ULADR".iduladr;


--
-- Name: seq_ulcapital; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_ulcapital
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_ulcapital OWNER TO "EGRUL_DEV2";

--
-- Name: seq_ulcapital; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_ulcapital OWNED BY public."ULCAPITAL".idulcapital;


--
-- Name: seq_ulfoms; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_ulfoms
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_ulfoms OWNER TO "EGRUL_DEV2";

--
-- Name: seq_ulfoms; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_ulfoms OWNED BY public."ULFOMS".idulfoms;


--
-- Name: seq_ulfss; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_ulfss
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_ulfss OWNER TO "EGRUL_DEV2";

--
-- Name: seq_ulfss; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_ulfss OWNED BY public."ULFSS".idulfss;


--
-- Name: seq_ulmns; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_ulmns
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_ulmns OWNER TO "EGRUL_DEV2";

--
-- Name: seq_ulmns; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_ulmns OWNED BY public."ULMNS".idulmns;


--
-- Name: seq_ulname; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_ulname
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_ulname OWNER TO "EGRUL_DEV2";

--
-- Name: seq_ulname; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_ulname OWNED BY public."ULNAME".idulname;


--
-- Name: seq_ulname_full; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_ulname_full
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_ulname_full OWNER TO "EGRUL_DEV2";

--
-- Name: seq_ulname_full; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_ulname_full OWNED BY public."ULNAME_FULL".idulname;


--
-- Name: seq_ulob; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_ulob
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_ulob OWNER TO "EGRUL_DEV2";

--
-- Name: seq_ulob; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_ulob OWNED BY public."ULOB".idulob;


--
-- Name: seq_ulokved; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_ulokved
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_ulokved OWNER TO "EGRUL_DEV2";

--
-- Name: seq_ulokved; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_ulokved OWNED BY public."ULOKVED".idulokved;


--
-- Name: seq_ulpf; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_ulpf
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_ulpf OWNER TO "EGRUL_DEV2";

--
-- Name: seq_ulpf; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_ulpf OWNED BY public."ULPF".idulpf;


--
-- Name: seq_ulpredsh; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_ulpredsh
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_ulpredsh OWNER TO "EGRUL_DEV2";

--
-- Name: seq_ulpredsh; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_ulpredsh OWNED BY public."ULPREDSH".idulpredsh;


--
-- Name: seq_ulpreem; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_ulpreem
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_ulpreem OWNER TO "EGRUL_DEV2";

--
-- Name: seq_ulpreem; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_ulpreem OWNED BY public."ULPREEM".idulpreem;


--
-- Name: seq_ulupr; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_ulupr
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_ulupr OWNER TO "EGRUL_DEV2";

--
-- Name: seq_ulupr; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_ulupr OWNED BY public."ULUPR".idulupr;


--
-- Name: seq_xml_load_log; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_xml_load_log
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_xml_load_log OWNER TO "EGRUL_DEV2";

--
-- Name: seq_xml_load_log; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_xml_load_log OWNED BY public."XML_LOAD_LOG".idxml;


--
-- Name: vidlic; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public.vidlic (
    idlic integer NOT NULL,
    idvidlic bigint NOT NULL
);


ALTER TABLE public.vidlic OWNER TO "EGRUL_DEV2";

--
-- Name: CN CN_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."CN"
    ADD CONSTRAINT "CN_pkey" PRIMARY KEY (idn);


--
-- Name: CT CT_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."CT"
    ADD CONSTRAINT "CT_pkey" PRIMARY KEY (idc);


--
-- Name: DS DS_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."DS"
    ADD CONSTRAINT "DS_pkey" PRIMARY KEY (idd);


--
-- Name: FLDOLGN FLDOLGN_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."FLDOLGN"
    ADD CONSTRAINT "FLDOLGN_pkey" PRIMARY KEY (idfldolgn);


--
-- Name: FLUCHR FLUCHR_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."FLUCHR"
    ADD CONSTRAINT "FLUCHR_pkey" PRIMARY KEY (idfluchr);


--
-- Name: FL FL_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."FL"
    ADD CONSTRAINT "FL_pkey" PRIMARY KEY (idfl);


--
-- Name: GOSREG GOSREG_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."GOSREG"
    ADD CONSTRAINT "GOSREG_pkey" PRIMARY KEY (idreg);


--
-- Name: IPCITIZEN IPCITIZEN_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPCITIZEN"
    ADD CONSTRAINT "IPCITIZEN_pkey" PRIMARY KEY (idipcitizen);


--
-- Name: IPDOKDSN IPDOKDSN_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPDOKDSN"
    ADD CONSTRAINT "IPDOKDSN_pkey" PRIMARY KEY (iddokdsn);


--
-- Name: IPFOMS IPFOMS_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPFOMS"
    ADD CONSTRAINT "IPFOMS_pkey" PRIMARY KEY (idipfoms);


--
-- Name: IPFSS IPFSS_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPFSS"
    ADD CONSTRAINT "IPFSS_pkey" PRIMARY KEY (idipfss);


--
-- Name: IPGOSREG IPGOSREG_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPGOSREG"
    ADD CONSTRAINT "IPGOSREG_pkey" PRIMARY KEY (regnum, idreg);


--
-- Name: IPMNS IPMNS_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPMNS"
    ADD CONSTRAINT "IPMNS_pkey" PRIMARY KEY (idipmns);


--
-- Name: IPNAME IPNAME_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPNAME"
    ADD CONSTRAINT "IPNAME_pkey" PRIMARY KEY (idipname);


--
-- Name: IPOKVED IPOKVED_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPOKVED"
    ADD CONSTRAINT "IPOKVED_pkey" PRIMARY KEY (idipokved);


--
-- Name: IPPF IPPF_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPPF"
    ADD CONSTRAINT "IPPF_pkey" PRIMARY KEY (idippf);


--
-- Name: IPREGOLD IPREGOLD_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPREGOLD"
    ADD CONSTRAINT "IPREGOLD_pkey" PRIMARY KEY (idipregold);


--
-- Name: IP IP_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IP"
    ADD CONSTRAINT "IP_pkey" PRIMARY KEY (idip);


--
-- Name: IUL IUL_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IUL"
    ADD CONSTRAINT "IUL_pkey" PRIMARY KEY (idiul);


--
-- Name: LICENZ LICENZ_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."LICENZ"
    ADD CONSTRAINT "LICENZ_pkey" PRIMARY KEY (idlic);


--
-- Name: OKATO_RAION OKATO_RAION_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."OKATO_RAION"
    ADD CONSTRAINT "OKATO_RAION_pkey" PRIMARY KEY (okato);


--
-- Name: OKSM OKSM_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."OKSM"
    ADD CONSTRAINT "OKSM_pkey" PRIMARY KEY (id);


--
-- Name: OKVED OKVED_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."OKVED"
    ADD CONSTRAINT "OKVED_pkey" PRIMARY KEY (idokved);


--
-- Name: POST_INDEXES POST_INDEXES_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."POST_INDEXES"
    ADD CONSTRAINT "POST_INDEXES_pkey" PRIMARY KEY (id_post_raion);


--
-- Name: PREFIKS_RAION PREFIKS_RAION_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."PREFIKS_RAION"
    ADD CONSTRAINT "PREFIKS_RAION_pkey" PRIMARY KEY (id_prefiks);


--
-- Name: RAION RAION_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."RAION"
    ADD CONSTRAINT "RAION_pkey" PRIMARY KEY (id_raion);


--
-- Name: REESTRAO REESTRAO_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."REESTRAO"
    ADD CONSTRAINT "REESTRAO_pkey" PRIMARY KEY (idreestrao);


--
-- Name: RG RG_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."RG"
    ADD CONSTRAINT "RG_pkey" PRIMARY KEY (idr);


--
-- Name: RUL RUL_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."RUL"
    ADD CONSTRAINT "RUL_pkey" PRIMARY KEY (idrul);


--
-- Name: SPDOKDN SPDOKDN_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."SPDOKDN"
    ADD CONSTRAINT "SPDOKDN_pkey" PRIMARY KEY (id);


--
-- Name: SPFOMS SPFOMS_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."SPFOMS"
    ADD CONSTRAINT "SPFOMS_pkey" PRIMARY KEY (id);


--
-- Name: SPFSS SPFSS_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."SPFSS"
    ADD CONSTRAINT "SPFSS_pkey" PRIMARY KEY (id);


--
-- Name: SPIPSTAT SPIPSTAT_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."SPIPSTAT"
    ADD CONSTRAINT "SPIPSTAT_pkey" PRIMARY KEY (id);


--
-- Name: SPLANG SPLANG_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."SPLANG"
    ADD CONSTRAINT "SPLANG_pkey" PRIMARY KEY (id);


--
-- Name: SPLICORG SPLICORG_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."SPLICORG"
    ADD CONSTRAINT "SPLICORG_pkey" PRIMARY KEY (id);


--
-- Name: SPMNS SPMNS_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."SPMNS"
    ADD CONSTRAINT "SPMNS_pkey" PRIMARY KEY (id);


--
-- Name: SPOPF SPOPF_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."SPOPF"
    ADD CONSTRAINT "SPOPF_pkey" PRIMARY KEY (idopf);


--
-- Name: SPOSNDN SPOSNDN_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."SPOSNDN"
    ADD CONSTRAINT "SPOSNDN_pkey" PRIMARY KEY (id);


--
-- Name: SPPF SPPF_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."SPPF"
    ADD CONSTRAINT "SPPF_pkey" PRIMARY KEY (id);


--
-- Name: SPREGORG SPREGORG_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."SPREGORG"
    ADD CONSTRAINT "SPREGORG_pkey" PRIMARY KEY (idspro);


--
-- Name: SPSOSTLIC SPSOSTLIC_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."SPSOSTLIC"
    ADD CONSTRAINT "SPSOSTLIC_pkey" PRIMARY KEY (idsostlic);


--
-- Name: SPULSTAT SPULSTAT_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."SPULSTAT"
    ADD CONSTRAINT "SPULSTAT_pkey" PRIMARY KEY (id);


--
-- Name: SPVIDADR SPVIDADR_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."SPVIDADR"
    ADD CONSTRAINT "SPVIDADR_pkey" PRIMARY KEY (id);


--
-- Name: SPVIDCAP SPVIDCAP_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."SPVIDCAP"
    ADD CONSTRAINT "SPVIDCAP_pkey" PRIMARY KEY (id);


--
-- Name: SPVIDCITIZEN SPVIDCITIZEN_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."SPVIDCITIZEN"
    ADD CONSTRAINT "SPVIDCITIZEN_pkey" PRIMARY KEY (id);


--
-- Name: SPVIDIP SPVIDIP_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."SPVIDIP"
    ADD CONSTRAINT "SPVIDIP_pkey" PRIMARY KEY (id);


--
-- Name: SPVIDLIC SPVIDLIC_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."SPVIDLIC"
    ADD CONSTRAINT "SPVIDLIC_pkey" PRIMARY KEY (idvidlic);


--
-- Name: SPVIDREG SPVIDREG_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."SPVIDREG"
    ADD CONSTRAINT "SPVIDREG_pkey" PRIMARY KEY (idvidreg);


--
-- Name: ST ST_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ST"
    ADD CONSTRAINT "ST_pkey" PRIMARY KEY (ids);


--
-- Name: ULADR ULADR_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULADR"
    ADD CONSTRAINT "ULADR_pkey" PRIMARY KEY (iduladr);


--
-- Name: ULCAPITAL ULCAPITAL_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULCAPITAL"
    ADD CONSTRAINT "ULCAPITAL_pkey" PRIMARY KEY (idulcapital);


--
-- Name: ULFOMS ULFOMS_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULFOMS"
    ADD CONSTRAINT "ULFOMS_pkey" PRIMARY KEY (idulfoms);


--
-- Name: ULFSS ULFSS_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULFSS"
    ADD CONSTRAINT "ULFSS_pkey" PRIMARY KEY (idulfss);


--
-- Name: ULMNS ULMNS_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULMNS"
    ADD CONSTRAINT "ULMNS_pkey" PRIMARY KEY (idulmns);


--
-- Name: ULNAME_FULL ULNAME_FULL_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULNAME_FULL"
    ADD CONSTRAINT "ULNAME_FULL_pkey" PRIMARY KEY (idulname);


--
-- Name: ULNAME ULNAME_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULNAME"
    ADD CONSTRAINT "ULNAME_pkey" PRIMARY KEY (idulname);


--
-- Name: ULOB ULOB_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULOB"
    ADD CONSTRAINT "ULOB_pkey" PRIMARY KEY (idulob);


--
-- Name: ULOKVED ULOKVED_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULOKVED"
    ADD CONSTRAINT "ULOKVED_pkey" PRIMARY KEY (idulokved);


--
-- Name: ULPF ULPF_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULPF"
    ADD CONSTRAINT "ULPF_pkey" PRIMARY KEY (idulpf);


--
-- Name: ULPREDSH ULPREDSH_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULPREDSH"
    ADD CONSTRAINT "ULPREDSH_pkey" PRIMARY KEY (idulpredsh);


--
-- Name: ULPREEM ULPREEM_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULPREEM"
    ADD CONSTRAINT "ULPREEM_pkey" PRIMARY KEY (idulpreem);


--
-- Name: ULUPR ULUPR_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULUPR"
    ADD CONSTRAINT "ULUPR_pkey" PRIMARY KEY (idulupr);


--
-- Name: UL_ACTUAL_DATA UL_ACTUAL_DATA_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."UL_ACTUAL_DATA"
    ADD CONSTRAINT "UL_ACTUAL_DATA_pkey" PRIMARY KEY (idul);


--
-- Name: UL UL_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."UL"
    ADD CONSTRAINT "UL_pkey" PRIMARY KEY (idul);


--
-- Name: XML_LOAD_LOG XML_LOAD_LOG_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."XML_LOAD_LOG"
    ADD CONSTRAINT "XML_LOAD_LOG_pkey" PRIMARY KEY (idxml);


--
-- Name: vidlic vidlic_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public.vidlic
    ADD CONSTRAINT vidlic_pkey PRIMARY KEY (idlic, idvidlic);


--
-- Name: ix_fam_name_otch; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_fam_name_otch ON public."FL" USING btree (famfl, namefl, otchfl);


--
-- Name: ix_fldolgn_idfl; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_fldolgn_idfl ON public."FLDOLGN" USING btree (idfl);


--
-- Name: ix_fldolgn_idul; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_fldolgn_idul ON public."FLDOLGN" USING btree (idul);


--
-- Name: ix_fluchr_idul; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_fluchr_idul ON public."FLUCHR" USING btree (idul);


--
-- Name: ix_gosregdtreg; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_gosregdtreg ON public."GOSREG" USING btree (dtreg);


--
-- Name: ix_gosregidul; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_gosregidul ON public."GOSREG" USING btree (idul);


--
-- Name: ix_ipcitizen_idip; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_ipcitizen_idip ON public."IPCITIZEN" USING btree (idip);


--
-- Name: ix_ipdokdsn_idip; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_ipdokdsn_idip ON public."IPDOKDSN" USING btree (idip);


--
-- Name: ix_ipgosregdtreg; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_ipgosregdtreg ON public."IPGOSREG" USING btree (dtreg);


--
-- Name: ix_ipgosregidip; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_ipgosregidip ON public."IPGOSREG" USING btree (idip);


--
-- Name: ix_ipinn; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_ipinn ON public."IP" USING btree (inn);


--
-- Name: ix_ipname_idip; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_ipname_idip ON public."IPNAME" USING btree (idip);


--
-- Name: ix_ipogrn; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_ipogrn ON public."IP" USING btree (ogrn);


--
-- Name: ix_ipokved_idip; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_ipokved_idip ON public."IPOKVED" USING btree (idip);


--
-- Name: ix_ipokved_idokved; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_ipokved_idokved ON public."IPOKVED" USING btree (idokved);


--
-- Name: ix_ipregoldidip; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_ipregoldidip ON public."IPREGOLD" USING btree (idip);


--
-- Name: ix_ipstart; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_ipstart ON public."IP" USING btree (ipstart);


--
-- Name: ix_iul_idul; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_iul_idul ON public."IUL" USING btree (idul);


--
-- Name: ix_rul_idul; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_rul_idul ON public."RUL" USING btree (idul);


--
-- Name: ix_spopfname; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_spopfname ON public."SPOPF" USING btree (name);


--
-- Name: ix_sppf_name; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_sppf_name ON public."SPPF" USING btree (name);


--
-- Name: ix_ul_dtregstart; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_ul_dtregstart ON public."UL" USING btree (dtregstart);


--
-- Name: ix_uladr_dtstart; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE UNIQUE INDEX ix_uladr_dtstart ON public."ULADR" USING btree (idul, dtstart);


--
-- Name: ix_uladr_idul; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_uladr_idul ON public."ULADR" USING btree (idul);


--
-- Name: ix_uladr_street; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_uladr_street ON public."ULADR" USING btree (idstreet);


--
-- Name: ix_ulinn; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_ulinn ON public."UL" USING btree (inn);


--
-- Name: ix_ulname_all_name; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_ulname_all_name ON public."ULNAME" USING btree (namei, names, namep);


--
-- Name: ix_ulname_dtstart; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_ulname_dtstart ON public."ULNAME" USING btree (dtstart);


--
-- Name: ix_ulname_full__full_name; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_ulname_full__full_name ON public."ULNAME_FULL" USING btree (full_name);


--
-- Name: ix_ulname_idopf; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_ulname_idopf ON public."ULNAME" USING btree (idopf);


--
-- Name: ix_ulname_idul; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_ulname_idul ON public."ULNAME" USING btree (idul);


--
-- Name: ix_ulname_namep; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_ulname_namep ON public."ULNAME" USING btree (namep);


--
-- Name: ix_ulogrn; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_ulogrn ON public."UL" USING btree (ogrn);


--
-- Name: ix_ulokved_idokved; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_ulokved_idokved ON public."ULOKVED" USING btree (idokved);


--
-- Name: ix_ulokved_idul; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_ulokved_idul ON public."ULOKVED" USING btree (idul);


--
-- Name: ix_ulraion; Type: INDEX; Schema: public; Owner: EGRUL_DEV2
--

CREATE INDEX ix_ulraion ON public."UL" USING btree (id_raion);


--
-- Name: FLDOLGN fldolgn_fl_idfl_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."FLDOLGN"
    ADD CONSTRAINT fldolgn_fl_idfl_fk FOREIGN KEY (idfl) REFERENCES public."FL"(idfl) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: FLDOLGN fldolgn_ul_idul_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."FLDOLGN"
    ADD CONSTRAINT fldolgn_ul_idul_fk FOREIGN KEY (idul) REFERENCES public."UL"(idul) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: FLUCHR fluchr_fl_idfl_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."FLUCHR"
    ADD CONSTRAINT fluchr_fl_idfl_fk FOREIGN KEY (idfl) REFERENCES public."FL"(idfl) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: FLUCHR fluchr_ul_idul_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."FLUCHR"
    ADD CONSTRAINT fluchr_ul_idul_fk FOREIGN KEY (idul) REFERENCES public."UL"(idul) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: GOSREG gosreg_spregorg_idspro_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."GOSREG"
    ADD CONSTRAINT gosreg_spregorg_idspro_fk FOREIGN KEY (idregorg) REFERENCES public."SPREGORG"(idspro) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: GOSREG gosreg_spvidreg_idvidreg_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."GOSREG"
    ADD CONSTRAINT gosreg_spvidreg_idvidreg_fk FOREIGN KEY (idvidreg) REFERENCES public."SPVIDREG"(idvidreg) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: GOSREG gosreg_ul_idul_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."GOSREG"
    ADD CONSTRAINT gosreg_ul_idul_fk FOREIGN KEY (idul) REFERENCES public."UL"(idul) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: IP ip_spipstat_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IP"
    ADD CONSTRAINT ip_spipstat_id_fk FOREIGN KEY (idstatus) REFERENCES public."SPIPSTAT"(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: IP ip_spregorg_idspro_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IP"
    ADD CONSTRAINT ip_spregorg_idspro_fk FOREIGN KEY (idregorg) REFERENCES public."SPREGORG"(idspro) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: IP ip_spvidip_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IP"
    ADD CONSTRAINT ip_spvidip_id_fk FOREIGN KEY (idvidip) REFERENCES public."SPVIDIP"(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: IPCITIZEN ipcitizen_ip_idip_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPCITIZEN"
    ADD CONSTRAINT ipcitizen_ip_idip_fk FOREIGN KEY (idip) REFERENCES public."IP"(idip) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: IPCITIZEN ipcitizen_oksm_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPCITIZEN"
    ADD CONSTRAINT ipcitizen_oksm_id_fk FOREIGN KEY (oksm) REFERENCES public."OKSM"(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: IPCITIZEN ipcitizen_spvidcitizen_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPCITIZEN"
    ADD CONSTRAINT ipcitizen_spvidcitizen_id_fk FOREIGN KEY (idvidcitizen) REFERENCES public."SPVIDCITIZEN"(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: IPDOKDSN ipdokdsn_ip_idip_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPDOKDSN"
    ADD CONSTRAINT ipdokdsn_ip_idip_fk FOREIGN KEY (idip) REFERENCES public."IP"(idip) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: IPDOKDSN ipdokdsn_spdokdn_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPDOKDSN"
    ADD CONSTRAINT ipdokdsn_spdokdn_id_fk FOREIGN KEY (iddokdn) REFERENCES public."SPDOKDN"(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: IPDOKDSN ipdokdsn_sposndn_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPDOKDSN"
    ADD CONSTRAINT ipdokdsn_sposndn_id_fk FOREIGN KEY (idosndn) REFERENCES public."SPOSNDN"(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: IPFOMS ipfoms_ip_idip_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPFOMS"
    ADD CONSTRAINT ipfoms_ip_idip_fk FOREIGN KEY (idip) REFERENCES public."IP"(idip) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: IPFOMS ipfoms_spfoms_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPFOMS"
    ADD CONSTRAINT ipfoms_spfoms_id_fk FOREIGN KEY (idfoms) REFERENCES public."SPFOMS"(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: IPFSS ipfss_ip_idip_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPFSS"
    ADD CONSTRAINT ipfss_ip_idip_fk FOREIGN KEY (idip) REFERENCES public."IP"(idip) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: IPFSS ipfss_spfss_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPFSS"
    ADD CONSTRAINT ipfss_spfss_id_fk FOREIGN KEY (idfss) REFERENCES public."SPFSS"(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: IPGOSREG ipgosreg_ip_idip_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPGOSREG"
    ADD CONSTRAINT ipgosreg_ip_idip_fk FOREIGN KEY (idip) REFERENCES public."IP"(idip) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: IPGOSREG ipgosreg_spregorg_idspro_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPGOSREG"
    ADD CONSTRAINT ipgosreg_spregorg_idspro_fk FOREIGN KEY (idregorg) REFERENCES public."SPREGORG"(idspro) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: IPGOSREG ipgosreg_spvidreg_idvidreg_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPGOSREG"
    ADD CONSTRAINT ipgosreg_spvidreg_idvidreg_fk FOREIGN KEY (idvidreg) REFERENCES public."SPVIDREG"(idvidreg) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: IPMNS ipmns_ip_idip_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPMNS"
    ADD CONSTRAINT ipmns_ip_idip_fk FOREIGN KEY (idip) REFERENCES public."IP"(idip) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: IPMNS ipmns_spmns_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPMNS"
    ADD CONSTRAINT ipmns_spmns_id_fk FOREIGN KEY (idmns) REFERENCES public."SPMNS"(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: IPNAME ipname_ip_idip_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPNAME"
    ADD CONSTRAINT ipname_ip_idip_fk FOREIGN KEY (idip) REFERENCES public."IP"(idip) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: IPOKVED ipokved_ip_idip_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPOKVED"
    ADD CONSTRAINT ipokved_ip_idip_fk FOREIGN KEY (idip) REFERENCES public."IP"(idip) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: IPOKVED ipokved_okved_idokved_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPOKVED"
    ADD CONSTRAINT ipokved_okved_idokved_fk FOREIGN KEY (idokved) REFERENCES public."OKVED"(idokved) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: IPPF ippf_ip_idip_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPPF"
    ADD CONSTRAINT ippf_ip_idip_fk FOREIGN KEY (idip) REFERENCES public."IP"(idip) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: IPPF ippf_sppf_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPPF"
    ADD CONSTRAINT ippf_sppf_id_fk FOREIGN KEY (idpf) REFERENCES public."SPPF"(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: IPREGOLD ipregold_ip_idip_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPREGOLD"
    ADD CONSTRAINT ipregold_ip_idip_fk FOREIGN KEY (idip) REFERENCES public."IP"(idip) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: IPREGOLD ipregold_spregorg_idspro_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IPREGOLD"
    ADD CONSTRAINT ipregold_spregorg_idspro_fk FOREIGN KEY (idregorg) REFERENCES public."SPREGORG"(idspro) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: IUL iul_oksm_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IUL"
    ADD CONSTRAINT iul_oksm_id_fk FOREIGN KEY (idoksm) REFERENCES public."OKSM"(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: IUL iul_ul_idul_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."IUL"
    ADD CONSTRAINT iul_ul_idul_fk FOREIGN KEY (idul) REFERENCES public."UL"(idul) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: LICENZ licenz_ip_idip_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."LICENZ"
    ADD CONSTRAINT licenz_ip_idip_fk FOREIGN KEY (idip) REFERENCES public."IP"(idip) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: LICENZ licenz_splicorg_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."LICENZ"
    ADD CONSTRAINT licenz_splicorg_id_fk FOREIGN KEY (idlicorg) REFERENCES public."SPLICORG"(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: LICENZ licenz_spsostlic_idsostlic_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."LICENZ"
    ADD CONSTRAINT licenz_spsostlic_idsostlic_fk FOREIGN KEY (idsostlic) REFERENCES public."SPSOSTLIC"(idsostlic) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: LICENZ licenz_ul_idul_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."LICENZ"
    ADD CONSTRAINT licenz_ul_idul_fk FOREIGN KEY (idul) REFERENCES public."UL"(idul) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: REESTRAO reestrao_ul_idul_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."REESTRAO"
    ADD CONSTRAINT reestrao_ul_idul_fk FOREIGN KEY (idul) REFERENCES public."UL"(idul) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: RUL rul_cn_idn_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."RUL"
    ADD CONSTRAINT rul_cn_idn_fk FOREIGN KEY (idnasp) REFERENCES public."CN"(idn) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: RUL rul_ct_idc_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."RUL"
    ADD CONSTRAINT rul_ct_idc_fk FOREIGN KEY (idgorod) REFERENCES public."CT"(idc) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: RUL rul_ds_idd_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."RUL"
    ADD CONSTRAINT rul_ds_idd_fk FOREIGN KEY (idraion) REFERENCES public."DS"(idd) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: RUL rul_rg_idr_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."RUL"
    ADD CONSTRAINT rul_rg_idr_fk FOREIGN KEY (idregion) REFERENCES public."RG"(idr) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: RUL rul_spregorg_idspro_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."RUL"
    ADD CONSTRAINT rul_spregorg_idspro_fk FOREIGN KEY (idregorg) REFERENCES public."SPREGORG"(idspro) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: RUL rul_st_ids_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."RUL"
    ADD CONSTRAINT rul_st_ids_fk FOREIGN KEY (idstreet) REFERENCES public."ST"(ids) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: RUL rul_ul_idul_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."RUL"
    ADD CONSTRAINT rul_ul_idul_fk FOREIGN KEY (idul) REFERENCES public."UL"(idul) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: UL ul_spregorg_idspro_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."UL"
    ADD CONSTRAINT ul_spregorg_idspro_fk FOREIGN KEY (idregorgstart) REFERENCES public."SPREGORG"(idspro) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: UL ul_spregorg_idspro_fk_2; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."UL"
    ADD CONSTRAINT ul_spregorg_idspro_fk_2 FOREIGN KEY (idregorgend) REFERENCES public."SPREGORG"(idspro) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: UL ul_spregorg_idspro_fk_3; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."UL"
    ADD CONSTRAINT ul_spregorg_idspro_fk_3 FOREIGN KEY (idregorg) REFERENCES public."SPREGORG"(idspro) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: UL ul_spulstat_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."UL"
    ADD CONSTRAINT ul_spulstat_id_fk FOREIGN KEY (idstatus) REFERENCES public."SPULSTAT"(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: UL ul_spvidreg_idvidreg_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."UL"
    ADD CONSTRAINT ul_spvidreg_idvidreg_fk FOREIGN KEY (idvidregstart) REFERENCES public."SPVIDREG"(idvidreg) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: UL ul_spvidreg_idvidreg_fk_2; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."UL"
    ADD CONSTRAINT ul_spvidreg_idvidreg_fk_2 FOREIGN KEY (idvidregend) REFERENCES public."SPVIDREG"(idvidreg) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULADR uladr_cn_idn_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULADR"
    ADD CONSTRAINT uladr_cn_idn_fk FOREIGN KEY (idnasp) REFERENCES public."CN"(idn) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULADR uladr_ct_idc_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULADR"
    ADD CONSTRAINT uladr_ct_idc_fk FOREIGN KEY (idgorod) REFERENCES public."CT"(idc) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULADR uladr_ds_idd_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULADR"
    ADD CONSTRAINT uladr_ds_idd_fk FOREIGN KEY (idraion) REFERENCES public."DS"(idd) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULADR uladr_rg_idr_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULADR"
    ADD CONSTRAINT uladr_rg_idr_fk FOREIGN KEY (idregion) REFERENCES public."RG"(idr) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULADR uladr_spvidadr_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULADR"
    ADD CONSTRAINT uladr_spvidadr_id_fk FOREIGN KEY (idvidadr) REFERENCES public."SPVIDADR"(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULADR uladr_st_ids_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULADR"
    ADD CONSTRAINT uladr_st_ids_fk FOREIGN KEY (idstreet) REFERENCES public."ST"(ids) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULADR uladr_ul_idul_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULADR"
    ADD CONSTRAINT uladr_ul_idul_fk FOREIGN KEY (idul) REFERENCES public."UL"(idul) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULCAPITAL ulcapital_spvidcap_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULCAPITAL"
    ADD CONSTRAINT ulcapital_spvidcap_id_fk FOREIGN KEY (idvidcap) REFERENCES public."SPVIDCAP"(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULCAPITAL ulcapital_ul_idul_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULCAPITAL"
    ADD CONSTRAINT ulcapital_ul_idul_fk FOREIGN KEY (idul) REFERENCES public."UL"(idul) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULFOMS ulfoms_spfoms_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULFOMS"
    ADD CONSTRAINT ulfoms_spfoms_id_fk FOREIGN KEY (idfoms) REFERENCES public."SPFOMS"(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULFOMS ulfoms_ul_idul_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULFOMS"
    ADD CONSTRAINT ulfoms_ul_idul_fk FOREIGN KEY (idul) REFERENCES public."UL"(idul) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULFSS ulfss_spfss_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULFSS"
    ADD CONSTRAINT ulfss_spfss_id_fk FOREIGN KEY (idfss) REFERENCES public."SPFSS"(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULFSS ulfss_ul_idul_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULFSS"
    ADD CONSTRAINT ulfss_ul_idul_fk FOREIGN KEY (idul) REFERENCES public."UL"(idul) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULMNS ulmns_spmns_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULMNS"
    ADD CONSTRAINT ulmns_spmns_id_fk FOREIGN KEY (idmns) REFERENCES public."SPMNS"(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULMNS ulmns_ul_idul_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULMNS"
    ADD CONSTRAINT ulmns_ul_idul_fk FOREIGN KEY (idul) REFERENCES public."UL"(idul) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULNAME ulname_splang_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULNAME"
    ADD CONSTRAINT ulname_splang_id_fk FOREIGN KEY (idlangi) REFERENCES public."SPLANG"(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULNAME ulname_spopf_idopf_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULNAME"
    ADD CONSTRAINT ulname_spopf_idopf_fk FOREIGN KEY (idopf) REFERENCES public."SPOPF"(idopf) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULNAME ulname_ul_idul_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULNAME"
    ADD CONSTRAINT ulname_ul_idul_fk FOREIGN KEY (idul) REFERENCES public."UL"(idul) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULOB ulob_cn_idn_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULOB"
    ADD CONSTRAINT ulob_cn_idn_fk FOREIGN KEY (idnasp) REFERENCES public."CN"(idn) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULOB ulob_ct_idc_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULOB"
    ADD CONSTRAINT ulob_ct_idc_fk FOREIGN KEY (idgorod) REFERENCES public."CT"(idc) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULOB ulob_ds_idd_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULOB"
    ADD CONSTRAINT ulob_ds_idd_fk FOREIGN KEY (idraion) REFERENCES public."DS"(idd) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULOB ulob_rg_idr_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULOB"
    ADD CONSTRAINT ulob_rg_idr_fk FOREIGN KEY (idregion) REFERENCES public."RG"(idr) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULOB ulob_st_ids_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULOB"
    ADD CONSTRAINT ulob_st_ids_fk FOREIGN KEY (idstreet) REFERENCES public."ST"(ids) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULOB ulob_ul_idul_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULOB"
    ADD CONSTRAINT ulob_ul_idul_fk FOREIGN KEY (idul) REFERENCES public."UL"(idul) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULOKVED ulokved_okved_idokved_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULOKVED"
    ADD CONSTRAINT ulokved_okved_idokved_fk FOREIGN KEY (idokved) REFERENCES public."OKVED"(idokved) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULOKVED ulokved_ul_idul_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULOKVED"
    ADD CONSTRAINT ulokved_ul_idul_fk FOREIGN KEY (idul) REFERENCES public."UL"(idul) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULPF ulpf_sppf_id_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULPF"
    ADD CONSTRAINT ulpf_sppf_id_fk FOREIGN KEY (idpf) REFERENCES public."SPPF"(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULPF ulpf_ul_idul_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULPF"
    ADD CONSTRAINT ulpf_ul_idul_fk FOREIGN KEY (idul) REFERENCES public."UL"(idul) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULPREDSH ulpredsh_cn_idn_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULPREDSH"
    ADD CONSTRAINT ulpredsh_cn_idn_fk FOREIGN KEY (idnasp) REFERENCES public."CN"(idn) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULPREDSH ulpredsh_ct_idc_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULPREDSH"
    ADD CONSTRAINT ulpredsh_ct_idc_fk FOREIGN KEY (idgorod) REFERENCES public."CT"(idc) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULPREDSH ulpredsh_ds_idd_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULPREDSH"
    ADD CONSTRAINT ulpredsh_ds_idd_fk FOREIGN KEY (idraion) REFERENCES public."DS"(idd) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULPREDSH ulpredsh_rg_idr_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULPREDSH"
    ADD CONSTRAINT ulpredsh_rg_idr_fk FOREIGN KEY (idregion) REFERENCES public."RG"(idr) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULPREDSH ulpredsh_spregorg_idspro_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULPREDSH"
    ADD CONSTRAINT ulpredsh_spregorg_idspro_fk FOREIGN KEY (idregorg) REFERENCES public."SPREGORG"(idspro) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULPREDSH ulpredsh_st_ids_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULPREDSH"
    ADD CONSTRAINT ulpredsh_st_ids_fk FOREIGN KEY (idstreet) REFERENCES public."ST"(ids) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULPREDSH ulpredsh_ul_idul_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULPREDSH"
    ADD CONSTRAINT ulpredsh_ul_idul_fk FOREIGN KEY (idul) REFERENCES public."UL"(idul) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULPREEM ulpreem_cn_idn_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULPREEM"
    ADD CONSTRAINT ulpreem_cn_idn_fk FOREIGN KEY (idnasp) REFERENCES public."CN"(idn) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULPREEM ulpreem_ct_idc_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULPREEM"
    ADD CONSTRAINT ulpreem_ct_idc_fk FOREIGN KEY (idgorod) REFERENCES public."CT"(idc) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULPREEM ulpreem_ds_idd_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULPREEM"
    ADD CONSTRAINT ulpreem_ds_idd_fk FOREIGN KEY (idraion) REFERENCES public."DS"(idd) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULPREEM ulpreem_rg_idr_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULPREEM"
    ADD CONSTRAINT ulpreem_rg_idr_fk FOREIGN KEY (idregion) REFERENCES public."RG"(idr) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULPREEM ulpreem_spregorg_idspro_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULPREEM"
    ADD CONSTRAINT ulpreem_spregorg_idspro_fk FOREIGN KEY (idregorg) REFERENCES public."SPREGORG"(idspro) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULPREEM ulpreem_st_ids_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULPREEM"
    ADD CONSTRAINT ulpreem_st_ids_fk FOREIGN KEY (idstreet) REFERENCES public."ST"(ids) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULPREEM ulpreem_ul_idul_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULPREEM"
    ADD CONSTRAINT ulpreem_ul_idul_fk FOREIGN KEY (idul) REFERENCES public."UL"(idul) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULUPR ulupr_cn_idn_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULUPR"
    ADD CONSTRAINT ulupr_cn_idn_fk FOREIGN KEY (idnasp) REFERENCES public."CN"(idn) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULUPR ulupr_ct_idc_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULUPR"
    ADD CONSTRAINT ulupr_ct_idc_fk FOREIGN KEY (idgorod) REFERENCES public."CT"(idc) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULUPR ulupr_ds_idd_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULUPR"
    ADD CONSTRAINT ulupr_ds_idd_fk FOREIGN KEY (idraion) REFERENCES public."DS"(idd) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULUPR ulupr_rg_idr_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULUPR"
    ADD CONSTRAINT ulupr_rg_idr_fk FOREIGN KEY (idregion) REFERENCES public."RG"(idr) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULUPR ulupr_st_ids_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULUPR"
    ADD CONSTRAINT ulupr_st_ids_fk FOREIGN KEY (idstreet) REFERENCES public."ST"(ids) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: ULUPR ulupr_ul_idul_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public."ULUPR"
    ADD CONSTRAINT ulupr_ul_idul_fk FOREIGN KEY (idul) REFERENCES public."UL"(idul) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: vidlic vidlic_licenz_idlic_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public.vidlic
    ADD CONSTRAINT vidlic_licenz_idlic_fk FOREIGN KEY (idlic) REFERENCES public."LICENZ"(idlic) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: vidlic vidlic_spvidlic_idvidlic_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public.vidlic
    ADD CONSTRAINT vidlic_spvidlic_idvidlic_fk FOREIGN KEY (idvidlic) REFERENCES public."SPVIDLIC"(idvidlic) ON UPDATE CASCADE ON DELETE CASCADE;
