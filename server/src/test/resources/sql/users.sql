INSERT
    INTO
        fw_user(
            id,
            password_hash,
            first_name,
            last_name,
            email,
            timezone,
            last_login_time,
            image_url,
            activated,
            lang_key,
            activation_key,
            reset_key,
            created_by,
            created_date,
            reset_date,
            last_modified_by,
            last_modified_date
        )
    VALUES(
        1,
        '$2a$10$VEjxo0jq2YG9Rbk2HmX9S.k1uZBGYUHdUcid3g/vfiEl7lwWgOHab',
        'User',
        'User',
        'user_1@localhost.io',
        'America/New_York',
        NULL,
        '',
        TRUE,
        'en',
        NULL,
        NULL,
        'system',
        NULL,
        NULL,
        'system',
        NULL
    );

INSERT
    INTO
        fw_user(
            id,
            password_hash,
            first_name,
            last_name,
            email,
            timezone,
            last_login_time,
            image_url,
            activated,
            lang_key,
            activation_key,
            reset_key,
            created_by,
            created_date,
            reset_date,
            last_modified_by,
            last_modified_date
        )
    VALUES(
        2,
        '$2a$10$gSAhZrxMllrbgj/kkK9UceBPpChGWJA7SYIb1Mqo.n5aNLq1/oR12',
        'Administrator',
        'Administrator',
        'user_2@localhost.io',
        'America/New_York',
        '2024-09-29 08:30:49.163501',
        '',
        TRUE,
        'en',
        NULL,
        NULL,
        'system',
        NULL,
        NULL,
        'system',
        NULL
    );
