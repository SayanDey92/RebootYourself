--CREATE master.app_config TABLE--

CREATE TABLE master.app_config
(
  primary_id integer NOT NULL,
  key_id character varying(200),
  key_value character varying(2000),
  isdelete boolean DEFAULT false,
  created_on time without time zone DEFAULT now(),
  updated_on time without time zone DEFAULT now(),
  created_by character varying(200) DEFAULT 'SYSTEM'::character varying,
  updated_by character varying(200) DEFAULT 'SYSTEM'::character varying,
  CONSTRAINT app_config_pkey PRIMARY KEY (primary_id)
)
--------------------------------------------------------------------------------------