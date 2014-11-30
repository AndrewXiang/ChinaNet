-- phpMyAdmin SQL Dump
-- version 2.11.2.1
-- http://www.phpmyadmin.net
--
-- 主机: localhost
-- 生成日期: 2013 年 09 月 26 日 05:09
-- 服务器版本: 5.0.45
-- PHP 版本: 5.2.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

--
-- 数据库: `mobile`
--

-- --------------------------------------------------------

--
-- 表的结构 `tcharge`
--

CREATE TABLE `tcharge` (
  `CHARGE_CODE` varchar(20) NOT NULL,
  `CHARGE_NAME` varchar(10) default NULL,
  `CHARGE` double(6,2) default NULL,
  PRIMARY KEY  (`CHARGE_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 导出表中的数据 `tcharge`
--

INSERT INTO `tcharge` (`CHARGE_CODE`, `CHARGE_NAME`, `CHARGE`) VALUES
('A', '开户费', 10.00),
('B', '漫游费', 5.00),
('C', '押金', 100.00),
('D', '入网费', 50.00),
('E', '选号费', 10.00);

-- --------------------------------------------------------

--
-- 表的结构 `tcharge_rule`
--

CREATE TABLE `tcharge_rule` (
  `FUNC_ID` varchar(10) NOT NULL,
  `CHARGE_CODE` varchar(10) default NULL,
  `FUNC_NAME` varchar(20) default NULL,
  KEY `CHAG_ID_FK` (`CHARGE_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 导出表中的数据 `tcharge_rule`
--

INSERT INTO `tcharge_rule` (`FUNC_ID`, `CHARGE_CODE`, `FUNC_NAME`) VALUES
('O', 'A', '??'),
('O', 'D', '??'),
('O', 'E', '??');

-- --------------------------------------------------------

--
-- 表的结构 `tcustomer`
--

CREATE TABLE `tcustomer` (
  `CUSTOMER_ID` int(8) NOT NULL,
  `ID_TYPE` varchar(10) default NULL,
  `ID_NUMBER` varchar(20) default NULL,
  `CUSTOMER_NAME` varchar(20) default NULL,
  `CUSTOMER_BIRTYDAY` varchar(50) default NULL,
  `CUSTOMER_SEX` varchar(20) default NULL,
  `CUSTOMER_ADDRESS` varchar(50) default NULL,
  PRIMARY KEY  (`CUSTOMER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 导出表中的数据 `tcustomer`
--

INSERT INTO `tcustomer` (`CUSTOMER_ID`, `ID_TYPE`, `ID_NUMBER`, `CUSTOMER_NAME`, `CUSTOMER_BIRTYDAY`, `CUSTOMER_SEX`, `CUSTOMER_ADDRESS`) VALUES
(1, '?????', '130533188905116611', '??', '0701', 'M', '??'),
(2, '?????', '123456789123456789', '??', '1990-10-11', 'M', '??'),
(3, '????????', '189988765430287931', '', '0925', 'M', '');
-- --------------------------------------------------------

--
-- 表的结构 `tmobiles`
--

CREATE TABLE `tmobiles` (
  `MOBILE_NUMBER` varchar(11) NOT NULL,
  `MOBILE_TYPE` varchar(20) default NULL,
  `CARD_NUMBER` varchar(20) default NULL,
  `IS_AVAILABLE` varchar(20) default NULL,
  PRIMARY KEY  (`MOBILE_NUMBER`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- 表的结构 `toperator`
--

CREATE TABLE `toperator` (
  `OPERATOR_ID` int(8) NOT NULL,
  `OPERATOR_NAME` varchar(20) default NULL,
  `OPERATOR_PWD` varchar(20) default NULL,
  `IS_ADMIN` int(11) default NULL,
  PRIMARY KEY  (`OPERATOR_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 导出表中的数据 `toperator`
--

INSERT INTO `toperator` (`OPERATOR_ID`, `OPERATOR_NAME`, `OPERATOR_PWD`, `IS_ADMIN`) VALUES
(1, '管理员', '1', 1),
(2, 'admin', 'admin', 1),
(3, 'user', 'user', 0);
-- --------------------------------------------------------

--
-- 表的结构 `tuser`
--

CREATE TABLE `tuser` (
  `USER_ID` int(8) NOT NULL,
  `MOBILE_NUMBER` varchar(11) default NULL,
  `ROAMING_STATUS` varchar(20) default NULL,
  `COM_LEVEL` varchar(20) default NULL,
  `CUSTOMER_ID` int(20) default NULL,
  PRIMARY KEY  (`USER_ID`),
  KEY `COSTM_ID_FK` (`CUSTOMER_ID`),
  KEY `MOBILE_ID_FK` (`MOBILE_NUMBER`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 导出表中的数据 `tuser`
--


--
-- 限制导出的表
--

--
-- 限制表 `tcharge_rule`
--
ALTER TABLE `tcharge_rule`
  ADD CONSTRAINT `CHAG_ID_FK` FOREIGN KEY (`CHARGE_CODE`) REFERENCES `tcharge` (`CHARGE_CODE`);

--
-- 限制表 `tuser`
--
ALTER TABLE `tuser`
  ADD CONSTRAINT `COSTM_ID_FK` FOREIGN KEY (`CUSTOMER_ID`) REFERENCES `tcustomer` (`CUSTOMER_ID`),
  ADD CONSTRAINT `MOBILE_ID_FK` FOREIGN KEY (`MOBILE_NUMBER`) REFERENCES `tmobiles` (`MOBILE_NUMBER`);
