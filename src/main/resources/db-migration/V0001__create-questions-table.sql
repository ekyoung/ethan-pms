CREATE TABLE public.questions
(
    question_id serial NOT NULL,
    subject text NOT NULL,
    content text NOT NULL,
    PRIMARY KEY (question_id)
)
WITH (
OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.questions
    OWNER to postgres;