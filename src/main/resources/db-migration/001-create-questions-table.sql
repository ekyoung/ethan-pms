CREATE TABLE public."Questions"
(
    "QuestionId" serial NOT NULL,
    "Subject" text NOT NULL,
    "Content" text NOT NULL,
    PRIMARY KEY ("QuestionId")
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."Questions"
    OWNER to postgres;