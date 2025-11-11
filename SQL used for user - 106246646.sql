SELECT
    *
FROM
    (
        SELECT
            *
        FROM
            andes.learn.transcripts trans
        WHERE
            trans.istoplevelflag = 'true'
    ) trans
    INNER JOIN (
        SELECT
            *
        FROM
            andes.learn.training training
        --WHERE
            --training.default_title IN ('Making Great Hiring Decisions')
    ) training ON trans.trainingid = training.learn_training_id
    INNER JOIN (
        SELECT
            *
        FROM
            andes.learn.users users
        WHERE
        users.PAPI_BI_LEGACYEMPLOYEEID IN (106246646)
    ) users ON trans.userid = users.id
	
###################################################################

WITH alias AS (
    SELECT id
    FROM "andes_ext"."learn"."users"
    WHERE papi_bi_legacyemployeeid = '106246646' --WE WILL NEED TO SWITCH THE EMPLOYEEID
),
user_transcript AS (
    SELECT *
    FROM alias a
    INNER JOIN "andes_ext"."learn"."transcripts" t
    ON a.id = t.userid
    WHERE t.lms = 'LEARN'
    AND t.trainingid in (
        'TCRLERN20240325125453e9ea8111',
        'TCRLERN20240325132513e3edf6c1',
        'TCRLERN202403251330191dfe8aba',
        'TCRLERN202404021155241c02672a',
        'TCRLERN202404050950456bd1f6ba',
        'TCRLERN2024040509561863bc6393',
        'TCRLERN20240405095946015d7761',
        'TCRLERN202404051001552e68af82',
        'TCRLERN20240405123739175270f3',
        'TCRLERN202404051239401741ed2a',
        'TCRLERN2024040512411854f55c22',
        'TCRLERN20240405124313b85e1017',
        'TCRLERN20240405124435c34d4cf4',
        'TCRLERN202404051246030bc6d209',
        'TCRLERN2024040512473007eae468',
        'TCRLERN20240405124953b8bf2423',
        'TCRLERN202404051251267ad68e2e',
        'TCRLERN202404051252442366ca46',
        'TCRLERN2024040512541006a8f4b1',
        'TCRLERN202404051255304d9eee88',
        'TCRLERN2024041509430642089d10',
        'TCRLERN20240415094356963b27ce'
    )
) SELECT t.*, tr.default_title
FROM user_transcript t
LEFT JOIN "andes"."learn"."training" tr
ON t.trainingid = tr.learn_training_id
AND t.trainingversion = tr.version

###################################################################