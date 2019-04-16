--
-- PostgreSQL database version 10.5
--

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

DROP DATABASE IF EXISTS egrulegrip;

--
-- Name: gripegrul; Type: DATABASE; Schema: -; Owner: EGRUL_DEV2
--

CREATE DATABASE egrulegrip WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Russian_Russia.1251' LC_CTYPE = 'Russian_Russia.1251';

ALTER DATABASE egrulegrip OWNER TO "EGRUL_DEV2";
