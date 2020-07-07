create database if not exists `db2020`;
use `db2020`;
drop table if exists `payment`;
/*!40101 set @saved_cs_client = @@character_set_client */;
/*!40101 set character_set_client = utf8mb4 */;
create table `payment`
(
    `id`     bigint(20)   not null auto_increment comment 'id',
    `serial` varchar(200) not null default '' comment '流水号',
    primary key (`id`)
) engine = innodb
  auto_increment = 1
  default charset = utf8mb4;
/*!40101 set character_set_client = @saved_cs_client */;