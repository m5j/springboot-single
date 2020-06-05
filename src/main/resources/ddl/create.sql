create table t_user
(
    id            char(44)     not null comment '主键ID'
        primary key,
    account       varchar(200) not null comment '账号',
    password      varchar(200) not null comment '密码',
    nick_name     varchar(200) not null comment '昵称',
    email         varchar(200) null comment '邮箱',
    phone         varchar(200) null comment '手机号码',
    status        char(10)     not null comment '状态',
    create_id     char(44)     null comment '创建人ID',
    create_time   datetime     null comment '创建时间',
    update_id     char(44)     null comment '更新人ID',
    update_time   datetime     null comment '更新时间',
    delete_status char(10)     null comment '逻辑删除'
);
insert into t_user
values ('bbc1460f-a561-11ea-b225-04d4c48cade4', 'minwujun', '123', '神秘用户', null, null, 'Y', null, null, null, null, 'N');

create table t_player
(
    id                 char(44)      not null comment '主键ID'
        primary key,
    user_id            char(44)      not null comment '外键，关联t_user.id',
    brief_introduction varchar(4000) null comment '个人简介',
    photo_url          varchar(4000) null comment '照片地址',
    status             char(10)      not null comment '状态',
    create_id          char(44)      null comment '创建人ID',
    create_time        datetime      null comment '创建时间',
    update_id          char(44)      null comment '更新人ID',
    update_time        datetime      null comment '更新时间',
    delete_status      char(10)      null comment '逻辑删除'
);
insert into t_player
values (uuid(), 'bbc1460f-a561-11ea-b225-04d4c48cade4', '韩服王者', null, 'Y', null, null, null, null, 'N');