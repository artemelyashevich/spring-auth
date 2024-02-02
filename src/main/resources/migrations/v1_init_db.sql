create table author (
    id bigint not null auto_increment,
    birthday varchar(255) not null,
    name varchar(255) not null,
    primary key (id)
) engine = InnoDB

create table book (
    id bigint not null auto_increment,
    description varchar(255),
    image_path varchar(255),
    page_count integer not null,
    pdf_path varchar(255),
    title varchar(255) not null,
    author_id bigint,
    genre_id bigint,
    publisher_id bigint,
    primary key (id)
) engine = InnoDB

create table genre (
    id bigint not null auto_increment,
    title varchar(255) not null,
    primary key (id)
) engine = InnoDB

create table publisher (
    id bigint not null auto_increment,
    name varchar(255),
    primary key (id)
) engine = InnoDB

create table roles (
    id bigint not null auto_increment,
    name varchar(255) not null,
    primary key (id)
) engine = InnoDB

create table users (
    id bigint not null auto_increment,
    email varchar(255) not null,
    name varchar(255) not null,
    password varchar(255) not null,
    primary key (id)
) engine = InnoDB

create table users_roles (
    user_id bigint not null,
    role_id bigint not null
) engine = InnoDB

alter table
    roles drop index UK_ofx66keruapi6vyqpv6f2or37

alter table
    roles
add
    constraint UK_ofx66keruapi6vyqpv6f2or37 unique (name)

alter table
    users drop index UK_6dotkott2kjsp8vw4d0m25fb7

alter table
    users
add
    constraint UK_6dotkott2kjsp8vw4d0m25fb7 unique (email)

alter table
    book
add
    constraint FKklnrv3weler2ftkweewlky958 foreign key (author_id) references author (id)

alter table
    book
add
    constraint FKm1t3yvw5i7olwdf32cwuul7ta foreign key (genre_id) references genre (id)

alter table
    book
add
    constraint FKgtvt7p649s4x80y6f4842pnfq foreign key (publisher_id) references publisher (id)

alter table
    users_roles
add
    constraint FKj6m8fwv7oqv74fcehir1a9ffy foreign key (role_id) references roles (id)

alter table
    users_roles
add
    constraint FK2o0jvgh89lemvvo17cbqvdxaa foreign key (user_id) references users (id)