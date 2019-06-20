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
-- DROP TABLE IF EXISTS
--

DROP TABLE IF EXISTS public.SPPREDDOK CASCADE;

--
-- Name: SPPREDDOK; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public.SPPREDDOK (
                                  iddok integer NOT NULL,
                                  numdok text,
                                  name text,
                                  --idreg text,
                                  dtdok timestamp without time zone,
                                  gihd__a_id_package integer,
                                  gihd__adate timestamp without time zone,
                                  gihd__ch_id_package integer,
                                  gihd__chdate timestamp without time zone,
                                  gihd__d_id_package integer,
                                  gihd__ddate timestamp without time zone,
                                  gihd__id_user integer,
                                  row_check_sum text
);


ALTER TABLE public.SPPREDDOK OWNER TO "EGRUL_DEV2";

--
-- Name: TABLE SPPREDDOK; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--
COMMENT ON TABLE public.SPPREDDOK IS 'Справочник "Документы, представленные при регистрации"';

--
-- Name: COLUMN SPPREDDOK.idvidreg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public.SPPREDDOK.iddok IS 'Идентификатор записи';


--
-- Name: COLUMN SPPREDDOK.name; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public.SPPREDDOK.name IS 'Наименование документа';


--
-- Name: COLUMN SPPREDDOK.numdok; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public.SPPREDDOK.numdok IS 'Номер документа';


--
-- Name: COLUMN SPPREDDOK.dtdok; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public.SPPREDDOK.dtdok IS 'Дата документа';


--
-- Name: COLUMN SPPREDDOK.idreg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

--COMMENT ON COLUMN public.SPPREDDOK.idreg IS 'Идентификатор гос. регистрации';


--
-- Name: COLUMN SPPREDDOK.gihd__a_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public.SPPREDDOK.gihd__a_id_package IS 'Идентификатор пакета данных актуализации';


--
-- Name: COLUMN SPPREDDOK.gihd__adate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public.SPPREDDOK.gihd__adate IS 'Дата актуализации';


--
-- Name: COLUMN SPPREDDOK.gihd__ch_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public.SPPREDDOK.gihd__ch_id_package IS 'Идентификатор пакета данных изменения';


--
-- Name: COLUMN SPPREDDOK.gihd__chdate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public.SPPREDDOK.gihd__chdate IS 'Дата изменения';


--
-- Name: COLUMN SPPREDDOK.gihd__d_id_package; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public.SPPREDDOK.gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';


--
-- Name: COLUMN SPPREDDOK.gihd__ddate; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public.SPPREDDOK.gihd__ddate IS 'Дата деактуализации';


--
-- Name: COLUMN SPPREDDOK.gihd__id_user; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public.SPPREDDOK.gihd__id_user IS 'Идентификатор пользователя';


--
-- Name: SPPREDDOK SPPREDDOK_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public.SPPREDDOK
  ADD CONSTRAINT "SPPREDDOK_pkey" PRIMARY KEY (iddok);


--
-- Name: SPPREDDOK sppreddok_gosreg_idreg_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

--ALTER TABLE ONLY public.SPPREDDOK
--  ADD CONSTRAINT sppreddok_gosreg_idreg_fk FOREIGN KEY (idreg) REFERENCES public."GOSREG"(idreg) ON UPDATE CASCADE ON DELETE CASCADE;
