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

DROP TABLE IF EXISTS public.IPEMAIL CASCADE;

-- Table: public.IPEMAIL


CREATE TABLE public.IPEMAIL
(
  idemail integer NOT NULL, -- Идентификатор записи
  email text NOT NULL, -- Адрес электронной почты ИП или КФХ
  regnum text, -- ГРН записи ЕГРИП
  dtzap timestamp without time zone, -- Дата внесения записи в ЕГРИП
  regnumcor text, -- ГРН внесения в ЕГРИП записи об исправлении
  dtcor timestamp without time zone, -- Дата внесения в ЕГРИП записи об исправлении
  gihd__a_id_package integer, -- Идентификатор пакета данных актуализации
  gihd__adate timestamp without time zone, -- Дата актуализации
  gihd__ch_id_package integer, -- Идентификатор пакета данных изменения
  gihd__chdate timestamp without time zone, -- Дата изменения
  gihd__d_id_package integer, -- Идентификатор пакета данных деактуализации
  gihd__ddate timestamp without time zone, -- Дата деактуализации
  gihd__id_user integer, -- Идентификатор пользователя
  row_check_sum text,
  idip text, -- Идентификатор ФЛ

  CONSTRAINT "IPEMAIL_pkey" PRIMARY KEY (idemail),
  CONSTRAINT email_ip_idip_fk FOREIGN KEY (idip)
      REFERENCES public.IP (idip) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.IPEMAIL
  OWNER TO "EGRUL_DEV2";
COMMENT ON TABLE public.IPEMAIL
  IS 'Адреса электронной почты';
COMMENT ON COLUMN public.IPEMAIL.idemail IS 'Идентификатор записи';
COMMENT ON COLUMN public.IPEMAIL.email IS 'Адрес электронной почты ИП или КФХ';
COMMENT ON COLUMN public.IPEMAIL.regnum IS 'ГРН записи ЕГРИП';
COMMENT ON COLUMN public.IPEMAIL.dtzap IS 'Дата внесения записи в ЕГРИП';
COMMENT ON COLUMN public.IPEMAIL.regnumcor IS 'Дата приостановки действия лиц';
COMMENT ON COLUMN public.IPEMAIL.dtcor IS 'Дата внесения в ЕГРИП записи об исправлении';
COMMENT ON COLUMN public.IPEMAIL.gihd__a_id_package IS 'Идентификатор пакета данных актуализации';
COMMENT ON COLUMN public.IPEMAIL.gihd__adate IS 'Дата актуализации';
COMMENT ON COLUMN public.IPEMAIL.gihd__ch_id_package IS 'Идентификатор пакета данных изменения';
COMMENT ON COLUMN public.IPEMAIL.gihd__chdate IS 'Дата изменения';
COMMENT ON COLUMN public.IPEMAIL.gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';
COMMENT ON COLUMN public.IPEMAIL.gihd__ddate IS 'Дата деактуализации';
COMMENT ON COLUMN public.IPEMAIL.gihd__id_user IS 'Идентификатор пользователя';
COMMENT ON COLUMN public.IPEMAIL.idip IS 'Идентификатор ФЛ';


