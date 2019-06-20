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
-- DROP SEQUENCE IF EXISTS
--

DROP SEQUENCE IF EXISTS public.seq_ipemail;

--
-- Name: seq_ipemail; Type: SEQUENCE; Schema: public; Owner: EGRUL_DEV2
--

CREATE SEQUENCE public.seq_ipemail
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.seq_ipemail OWNER TO "EGRUL_DEV2";

--
-- Name: seq_ipemail; Type: SEQUENCE OWNED BY; Schema: public; Owner: EGRUL_DEV2
--

ALTER SEQUENCE public.seq_ipemail OWNED BY public.IPEMAIL.idemail;