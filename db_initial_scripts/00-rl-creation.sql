--
-- PostgreSQL database cluster dump
--

SET default_transaction_read_only = off;

SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;



--
-- Drop roles
--

DROP ROLE IF EXISTS "EGRUL_DEV2";

--
-- Roles
--

CREATE ROLE "EGRUL_DEV2";
ALTER ROLE "EGRUL_DEV2" WITH NOSUPERUSER INHERIT NOCREATEROLE NOCREATEDB LOGIN NOREPLICATION NOBYPASSRLS PASSWORD 'md5532e721e70454a5e1bb4be013fccf33b' VALID UNTIL 'infinity';


--
-- PostgreSQL database cluster dump complete
--

