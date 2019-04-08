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

DROP TABLE IF EXISTS public.regdok CASCADE;

--
-- Name: regdok; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public.regdok (
                                  idreg text,
                                  iddok integer
);

ALTER TABLE public.regdok OWNER TO "EGRUL_DEV2";

--
-- Name: COLUMN regdok.idreg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public.regdok.idreg IS 'Идентификатор гос. регистрации';

--
-- Name: COLUMN regdok.iddok; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public.regdok.iddok IS 'Идентификатор документа';

--
-- Name: regdok regdok_pkey; Type: CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public.regdok
  ADD CONSTRAINT "regdok_pkey" PRIMARY KEY (idreg, iddok);

--
-- Name: regdok regdok_gosreg_idreg_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public.regdok
  ADD CONSTRAINT regdok_gosreg_idreg_fk FOREIGN KEY (idreg) REFERENCES public."GOSREG"(idreg) ON UPDATE CASCADE ON DELETE CASCADE;

--
-- Name: regdok regdok_sppreddok_iddok_fk; Type: FK CONSTRAINT; Schema: public; Owner: EGRUL_DEV2
--

ALTER TABLE ONLY public.regdok
  ADD CONSTRAINT regdok_sppreddok_iddok_fk FOREIGN KEY (iddok) REFERENCES public."SPPREDDOK"(iddok) ON UPDATE CASCADE ON DELETE CASCADE;
