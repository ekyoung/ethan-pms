ALTER TABLE public.questions
    ADD COLUMN scope text;

UPDATE public.questions
    SET scope = 'main';

ALTER TABLE public.questions
    ALTER COLUMN scope SET NOT NULL;