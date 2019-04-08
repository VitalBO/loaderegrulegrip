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

DROP TABLE IF EXISTS public."IPADR" CASCADE;

--
-- Name: IPADR; Type: TABLE; Schema: public; Owner: EGRUL_DEV2
--

CREATE TABLE public."IPADR"
(
  idipadr integer NOT NULL, -- Идентификатор записи
  address text,
  okato text, -- ОКАТО
  indeks text, -- Индекс
  kodrg text, -- Код субъекта Российской Федерации
  kod_kl text, -- Код по справочнику КЛАДР
  dom text, -- Дом
  korp text, -- Корпус
  kvart text, -- Квартира
  idregion bigint, -- Регион (идентификатор)
  idraion bigint, -- Район РФ (идентификатор)
  idgorod bigint, -- Город (идентификатор)
  idnasp bigint, -- Населенный пункт (идентификатор)
  idstreet bigint, -- Улица (идентификатор)
  idip text, -- Идентификатор ФЛ
  regnum text, -- ГРН записи ЕГРИП
  dtstart timestamp without time zone, -- Дата начала действия записи
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

  CONSTRAINT "IPADR_pkey" PRIMARY KEY (idipadr),
  CONSTRAINT ipadr_rg_idr_fk FOREIGN KEY (idregion)
      REFERENCES public."RG" (idr) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE,
  CONSTRAINT ipadr_ds_idd_fk FOREIGN KEY (idraion)
      REFERENCES public."DS" (idd) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE,
  CONSTRAINT ipadr_ct_idc_fk FOREIGN KEY (idgorod)
      REFERENCES public."CT" (idc) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE,
  CONSTRAINT ipadr_cn_idn_fk FOREIGN KEY (idnasp)
      REFERENCES public."CN" (idn) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE,
  CONSTRAINT ipadr_st_ids_fk FOREIGN KEY (idstreet)
      REFERENCES public."ST" (ids) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE,
  CONSTRAINT ipadr_ul_idip_fk FOREIGN KEY (idip)
      REFERENCES public."IP" (idip) MATCH SIMPLE
      ON UPDATE CASCADE ON DELETE CASCADE
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public."IPADR"
  OWNER TO "EGRUL_DEV2";
COMMENT ON TABLE public."IPADR"
  IS 'Адреса ФЛ';
COMMENT ON COLUMN public."IPADR".idipadr IS 'Идентификатор записи';
COMMENT ON COLUMN public."IPADR".okato IS 'ОКАТО';
COMMENT ON COLUMN public."IPADR".indeks IS 'Индекс';
COMMENT ON COLUMN public."IPADR".kodrg IS 'Код субъекта Российской Федерации';
COMMENT ON COLUMN public."IPADR".kod_kl IS 'Код по справочнику КЛАДР';
COMMENT ON COLUMN public."IPADR".dom IS 'Дом';
COMMENT ON COLUMN public."IPADR".korp IS 'Корпус';
COMMENT ON COLUMN public."IPADR".kvart IS 'Квартира';
COMMENT ON COLUMN public."IPADR".idregion IS 'Регион (идентификатор)';
COMMENT ON COLUMN public."IPADR".idraion IS 'Район РФ (идентификатор)';
COMMENT ON COLUMN public."IPADR".idgorod IS 'Город (идентификатор)';
COMMENT ON COLUMN public."IPADR".idnasp IS 'Населенный пункт (идентификатор)';
COMMENT ON COLUMN public."IPADR".idstreet IS 'Улица (идентификатор)';
COMMENT ON COLUMN public."IPADR".idip IS 'Идентификатор ФЛ';
COMMENT ON COLUMN public."IPADR".regnum IS 'ГРН записи ЕГРИП';
COMMENT ON COLUMN public."IPADR".dtstart IS 'Дата начала действия записи';
COMMENT ON COLUMN public."IPADR".regnumcor IS 'ГРН внесения в ЕГРИП записи об исправлении';
COMMENT ON COLUMN public."IPADR".dtcor IS 'Дата внесения в ЕГРИП записи об исправлении';
COMMENT ON COLUMN public."IPADR".gihd__a_id_package IS 'Идентификатор пакета данных актуализации';
COMMENT ON COLUMN public."IPADR".gihd__adate IS 'Дата актуализации';
COMMENT ON COLUMN public."IPADR".gihd__ch_id_package IS 'Идентификатор пакета данных изменения';
COMMENT ON COLUMN public."IPADR".gihd__chdate IS 'Дата изменения';
COMMENT ON COLUMN public."IPADR".gihd__d_id_package IS 'Идентификатор пакета данных деактуализации';
COMMENT ON COLUMN public."IPADR".gihd__ddate IS 'Дата деактуализации';
COMMENT ON COLUMN public."IPADR".gihd__id_user IS 'Идентификатор пользователя';

-- Index: public.ix_ipadr_dtstart

DROP INDEX IF EXISTS public.ix_ipadr_dtstart;

CREATE UNIQUE INDEX ix_ipadr_dtstart
  ON public."IPADR"
  USING btree
  (idip COLLATE pg_catalog."default", dtstart);

-- Index: public.ix_ipadr_idip

DROP INDEX IF EXISTS public.ix_ipadr_idip;

CREATE INDEX ix_ipadr_idip
  ON public."IPADR"
  USING btree
  (idip COLLATE pg_catalog."default");

-- Index: public.ix_ipadr_street

DROP INDEX IF EXISTS public.ix_ipadr_street;

CREATE INDEX ix_ipadr_street
  ON public."IPADR"
  USING btree
  (idstreet);