
--------------------------ALTER TABLE UL--------------------------------------------

ALTER TABLE ONLY public."UL" ADD COLUMN IF NOT EXISTS dtform timestamp without time zone;

--
-- Name: COLUMN "UL".dtform; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL".dtform IS 'Дата формирования сведений';


ALTER TABLE ONLY public."UL" ADD COLUMN IF NOT EXISTS dtogrn timestamp without time zone;

--
-- Name: COLUMN "UL".dtogrn; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."UL".dtogrn IS 'Дата присвоения ОГРН';

--------------------------ALTER TABLE SPREGORG--------------------------------------------

ALTER TABLE ONLY public."SPREGORG" ADD COLUMN IF NOT EXISTS address text;

--
-- Name: COLUMN "SPREGORG".address; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."SPREGORG".address IS 'Адрес регистрирующего органа';

--------------------------ALTER TABLE OKVED--------------------------------------------

ALTER TABLE ONLY public."OKVED" ADD COLUMN IF NOT EXISTS vers_okved text;

--
-- Name: COLUMN "OKVED".vers_okved; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKVED".vers_okved IS 'Признак версии ОКВЭД';


ALTER TABLE ONLY public."OKVED" ADD COLUMN IF NOT EXISTS regnum text;

--
-- Name: COLUMN "OKVED".regnum; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKVED".regnum IS 'ГРН записи ЕГРЮЛ';


ALTER TABLE ONLY public."OKVED" ADD COLUMN IF NOT EXISTS dtreg timestamp without time zone;

--
-- Name: COLUMN "OKVED".dtreg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."OKVED".dtreg IS 'Дата внесения записи в ЕГРЮЛ';

--------------------------ALTER TABLE ULNAME--------------------------------------------

ALTER TABLE ONLY public."ULNAME" ADD COLUMN IF NOT EXISTS regnum text;

--
-- Name: COLUMN "ULNAME".regnum; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULNAME".regnum IS 'ГРН записи ЕГРЮЛ';

--------------------------ALTER TABLE ULADR--------------------------------------------

ALTER TABLE ONLY public."ULADR" ADD COLUMN IF NOT EXISTS regnum text;

--
-- Name: COLUMN "ULADR".regnum; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULADR".regnum IS 'ГРН записи ЕГРЮЛ';


ALTER TABLE ONLY public."ULADR" ADD COLUMN IF NOT EXISTS kod_kl text;

--
-- Name: COLUMN "ULADR".kod_kl; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULADR".kod_kl IS 'Код по справочнику КЛАДР';

--------------------------ALTER TABLE RG--------------------------------------------

ALTER TABLE ONLY public."RG" ADD COLUMN IF NOT EXISTS typerg text;

--
-- Name: COLUMN "RG".typerg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RG".typerg IS 'Тип элемента регион';


ALTER TABLE ONLY public."RG" ADD COLUMN IF NOT EXISTS namerg text;

--
-- Name: COLUMN "RG".namerg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."RG".namerg IS 'Наименование элемента регион';

--------------------------ALTER TABLE DS--------------------------------------------

ALTER TABLE ONLY public."DS" ADD COLUMN IF NOT EXISTS typeds text;

--
-- Name: COLUMN "DS".typeds; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."DS".typeds IS 'Тип элемента район';


ALTER TABLE ONLY public."DS" ADD COLUMN IF NOT EXISTS nameds text;

--
-- Name: COLUMN "DS".nameds; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."DS".nameds IS 'Наименование элемента район';

--------------------------ALTER TABLE CT--------------------------------------------

ALTER TABLE ONLY public."CT" ADD COLUMN IF NOT EXISTS typect text;

--
-- Name: COLUMN "CT".typect; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."CT".typect IS 'Тип элемента город';


ALTER TABLE ONLY public."CT" ADD COLUMN IF NOT EXISTS namect text;

--
-- Name: COLUMN "CT".namect; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."CT".namect IS 'Наименование элемента город';

--------------------------ALTER TABLE CN--------------------------------------------

ALTER TABLE ONLY public."CN" ADD COLUMN IF NOT EXISTS typecn text;

--
-- Name: COLUMN "CN".typecn; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."CN".typecn IS 'Тип элемента населенный пункт';


ALTER TABLE ONLY public."CN" ADD COLUMN IF NOT EXISTS namecn text;

--
-- Name: COLUMN "CN".namecn; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."CN".namecn IS 'Наименование элемента населенный пункт';

--------------------------ALTER TABLE ST--------------------------------------------

ALTER TABLE ONLY public."ST" ADD COLUMN IF NOT EXISTS typest text;

--
-- Name: COLUMN "ST".typest; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ST".typest IS 'Тип адресного объекта улица';


ALTER TABLE ONLY public."ST" ADD COLUMN IF NOT EXISTS namest text;

--
-- Name: COLUMN "ST".namest; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ST".namest IS 'Наименование адресного объекта улица';


--------------------------ALTER TABLE ULCAPITAL--------------------------------------------

ALTER TABLE ONLY public."ULCAPITAL" ADD COLUMN IF NOT EXISTS regnum text;

--
-- Name: COLUMN "ULCAPITAL".regnum; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULCAPITAL".regnum IS 'ГРН записи ЕГРЮЛ';


--------------------------ALTER TABLE FLUCHR--------------------------------------------

ALTER TABLE ONLY public."FLUCHR" ADD COLUMN IF NOT EXISTS regnum text;

--
-- Name: COLUMN "FLUCHR".regnum; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLUCHR".regnum IS 'ГРН внесения в ЕГРЮЛ сведений о данном лице';


ALTER TABLE ONLY public."FLUCHR" ADD COLUMN IF NOT EXISTS regnumd text;

--
-- Name: COLUMN "FLUCHR".regnumd; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLUCHR".regnumd IS 'ГРН внесения в ЕГРЮЛ записи, содержащей указанные сведения';


ALTER TABLE ONLY public."FLUCHR" ADD COLUMN IF NOT EXISTS dtstartd timestamp without time zone;

--
-- Name: COLUMN "FLUCHR".dtstartd; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLUCHR".dtstartd IS 'Дата внесения в ЕГРЮЛ записи, содержащей указанные сведения';


ALTER TABLE ONLY public."FLUCHR" ADD COLUMN IF NOT EXISTS percent decimal;

--
-- Name: COLUMN "FLUCHR".percent; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLUCHR".percent IS 'Размер доли в процентах';

--------------------------ALTER TABLE FL--------------------------------------------

ALTER TABLE ONLY public."FL" ADD COLUMN IF NOT EXISTS regnumfl text;

--
-- Name: COLUMN "FL".regnum; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FL".regnumfl IS 'ГРН внесения в ЕГРЮЛ записи, содержащей указанные сведения';


ALTER TABLE ONLY public."FL" ADD COLUMN IF NOT EXISTS dtstartfl timestamp without time zone;

--
-- Name: COLUMN "FL".dtstartfl; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FL".dtstartfl IS 'Дата внесения в ЕГРЮЛ записи, содержащей указанные сведения';

--------------------------ALTER TABLE FLDOLGN--------------------------------------------

ALTER TABLE ONLY public."FLDOLGN" ADD COLUMN IF NOT EXISTS regnum text;

--
-- Name: COLUMN "FLDOLGN".regnum; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLDOLGN".regnum IS 'ГРН внесения в ЕГРЮЛ сведений о данном лице';


ALTER TABLE ONLY public."FLDOLGN" ADD COLUMN IF NOT EXISTS dolgnvid text;

--
-- Name: COLUMN "FLDOLGN".dolgnvid; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLDOLGN".dolgnvid IS 'Вид должностного лица по справочнику СКФЛЮЛ';


ALTER TABLE ONLY public."FLDOLGN" ADD COLUMN IF NOT EXISTS dolgnvidname text;

--
-- Name: COLUMN "FLDOLGN".dolgnvidname; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLDOLGN".dolgnvidname IS 'Наименование вида должностного лица по справочнику СКФЛЮЛ';


ALTER TABLE ONLY public."FLDOLGN" ADD COLUMN IF NOT EXISTS regnumd text;

--
-- Name: COLUMN "FLDOLGN".regnumd; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLDOLGN".regnumd IS 'ГРН внесения в ЕГРЮЛ записи, содержащей указанные сведения';


ALTER TABLE ONLY public."FLDOLGN" ADD COLUMN IF NOT EXISTS dtstartd timestamp without time zone;

--
-- Name: COLUMN "FLDOLGN".dtstartd; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."FLDOLGN".dtstartd IS 'Дата внесения в ЕГРЮЛ записи, содержащей указанные сведения';

--------------------------ALTER TABLE ULMNS--------------------------------------------

ALTER TABLE ONLY public."ULMNS" ADD COLUMN IF NOT EXISTS regnum text;

--
-- Name: COLUMN "ULMNS".regnum; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULMNS".regnum IS 'ГРН внесения в ЕГРЮЛ сведений о данном лице';


ALTER TABLE ONLY public."ULMNS" ADD COLUMN IF NOT EXISTS dtzap timestamp without time zone;

--
-- Name: COLUMN "ULMNS".dtzap; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULMNS".dtzap IS 'Дата внесения в ЕГРЮЛ записи, содержащей указанные сведения';

--------------------------ALTER TABLE ULPF--------------------------------------------

ALTER TABLE ONLY public."ULPF" ADD COLUMN IF NOT EXISTS regnum text;

--
-- Name: COLUMN "ULPF".regnum; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPF".regnum IS 'ГРН внесения в ЕГРЮЛ сведений о данном лице';


ALTER TABLE ONLY public."ULPF" ADD COLUMN IF NOT EXISTS dtzap timestamp without time zone;

--
-- Name: COLUMN "ULPF".dtzap; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULPF".dtzap IS 'Дата внесения в ЕГРЮЛ записи, содержащей указанные сведения';

--------------------------ALTER TABLE ULFSS--------------------------------------------

ALTER TABLE ONLY public."ULFSS" ADD COLUMN IF NOT EXISTS regnum text;

--
-- Name: COLUMN "ULFSS".regnum; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULFSS".regnum IS 'ГРН внесения в ЕГРЮЛ сведений о данном лице';


ALTER TABLE ONLY public."ULFSS" ADD COLUMN IF NOT EXISTS dtzap timestamp without time zone;

--
-- Name: COLUMN "ULFSS".dtzap; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."ULFSS".dtzap IS 'Дата внесения в ЕГРЮЛ записи, содержащей указанные сведения';

--------------------------ALTER TABLE IP--------------------------------------------

ALTER TABLE ONLY public."IP" ADD COLUMN IF NOT EXISTS dtogrn timestamp without time zone;

--
-- Name: COLUMN "IP".dtogrn; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".dtogrn IS 'Дата присвоения ОГРНИП';


ALTER TABLE ONLY public."IP" ADD COLUMN IF NOT EXISTS regnum text;

--
-- Name: COLUMN "IP".regnum; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".regnum IS 'Регистрационный номер, присвоенный до 1 января 2004 года';


ALTER TABLE ONLY public."IP" ADD COLUMN IF NOT EXISTS dtreg timestamp without time zone;

--
-- Name: COLUMN "IP".dtreg; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".dtreg IS 'Дата регистрации до 1 января 2004 года';


ALTER TABLE ONLY public."IP" ADD COLUMN IF NOT EXISTS regorgname text;

--
-- Name: COLUMN "IP".regorgname; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".regorgname IS 'Наименование органа, зарегистрировавшего ИП или КФХ до 1 января 2004 года';


ALTER TABLE ONLY public."IP" ADD COLUMN IF NOT EXISTS kodstatusend text;

--
-- Name: COLUMN "IP".kodstatusend; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".kodstatusend IS 'Код способа прекращения по справочнику СИППД';


ALTER TABLE ONLY public."IP" ADD COLUMN IF NOT EXISTS namestatusend text;

--
-- Name: COLUMN "IP".namestatusend; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".namestatusend IS 'Наименование способа прекращения по справочнику СИППД';


ALTER TABLE ONLY public."IP" ADD COLUMN IF NOT EXISTS dtend timestamp without time zone;

--
-- Name: COLUMN "IP".dtend; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".dtend IS 'Дата прекращения';


ALTER TABLE ONLY public."IP" ADD COLUMN IF NOT EXISTS regnumend text;

--
-- Name: COLUMN "IP".regnumend; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".regnumend IS 'ГРН записи ЕГРИП';


ALTER TABLE ONLY public."IP" ADD COLUMN IF NOT EXISTS dtregend timestamp without time zone;

--
-- Name: COLUMN "IP".dtregend; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".dtregend IS 'Дата внесения записи в ЕГРИП';


ALTER TABLE ONLY public."IP" ADD COLUMN IF NOT EXISTS ogrn_ul text;

--
-- Name: COLUMN "IP".ogrn_ul; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".ogrn_ul IS 'ОГРН ЮЛ, созданного на базе имущества КФХ';


ALTER TABLE ONLY public."IP" ADD COLUMN IF NOT EXISTS inn_ul text;

--
-- Name: COLUMN "IP".inn_ul; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".inn_ul IS 'ИНН юридического лица';


ALTER TABLE ONLY public."IP" ADD COLUMN IF NOT EXISTS namep_ul text;

--
-- Name: COLUMN "IP".namep_ul; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".namep_ul IS 'Полное наименование юридического лица';


ALTER TABLE ONLY public."IP" ADD COLUMN IF NOT EXISTS grnzap text;

--
-- Name: COLUMN "IP".grnzap; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".grnzap IS 'ГРН записи ЕГРИП';


ALTER TABLE ONLY public."IP" ADD COLUMN IF NOT EXISTS dtzap timestamp without time zone;

--
-- Name: COLUMN "IP".dtzap; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".dtzap IS 'Дата внесения записи в ЕГРИП';


ALTER TABLE ONLY public."IP" ADD COLUMN IF NOT EXISTS grncor text;

--
-- Name: COLUMN "IP".grncor; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".grncor IS 'ГРН внесения в ЕГРИП записи об исправлении';


ALTER TABLE ONLY public."IP" ADD COLUMN IF NOT EXISTS dtcor timestamp without time zone;

--
-- Name: COLUMN "IP".dtcor; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."IP".dtcor IS 'Дата внесения в ЕГРИП записи об исправлении';

--------------------------ALTER TABLE LICENZ--------------------------------------------

ALTER TABLE ONLY public."LICENZ" ADD COLUMN IF NOT EXISTS orgstopname text;

--
-- Name: COLUMN "LICENZ".orgstopname; Type: COMMENT; Schema: public; Owner: EGRUL_DEV2
--

COMMENT ON COLUMN public."LICENZ".orgstopname IS 'Наименование лицензирующего органа, приостановившего действие лицензии';