/*
Navicat MySQL Data Transfer

Source Server         : pandaSQL
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : webfavorite

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2019-02-17 00:36:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `account` varchar(40) NOT NULL,
  `password` varchar(40) NOT NULL,
  `email` varchar(40) DEFAULT NULL,
  `logo` varchar(40) DEFAULT NULL,
  `state` varchar(3) DEFAULT '0' COMMENT '1是正常，0是不通过申请',
  `regeditTime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='管理员';

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('admin', 'admin', '287595523@qq.com', 'null', '1', '2019-02-17 00:14:13', null);

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `detail` varchar(255) DEFAULT NULL,
  `form` varchar(50) DEFAULT NULL,
  `to` varchar(50) DEFAULT NULL,
  `time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `state` varchar(3) DEFAULT '0' COMMENT '0是未读，1是已读',
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='信息。主要发送给用户。管理员发送给用户账号即为admin';

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('测试', '1', '1', '2019-02-17 00:16:14', '0', '1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `account` varchar(40) NOT NULL,
  `password` varchar(40) NOT NULL,
  `email` varchar(40) NOT NULL,
  `logo` varchar(40) NOT NULL,
  `regeditTime` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP,
  `state` varchar(3) NOT NULL DEFAULT '1' COMMENT '1是正常，0是封号',
  `introduction` varchar(255) DEFAULT NULL COMMENT '用户自我描述',
  `name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('admin', 'admin', '287595523@qq.com', '/basic/html/webfavorite/logo/default.jpg', '2019-02-16 23:38:07', '1', '我是管理员', null);

-- ----------------------------
-- Table structure for userlikeuser
-- ----------------------------
DROP TABLE IF EXISTS `userlikeuser`;
CREATE TABLE `userlikeuser` (
  `idolAccount` varchar(40) DEFAULT NULL,
  `funsAccount` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户关注某个用户';

-- ----------------------------
-- Records of userlikeuser
-- ----------------------------

-- ----------------------------
-- Table structure for userwebsite
-- ----------------------------
DROP TABLE IF EXISTS `userwebsite`;
CREATE TABLE `userwebsite` (
  `url` varchar(255) DEFAULT NULL,
  `account` varchar(40) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `logo` varchar(255) DEFAULT NULL,
  `detail` varchar(255) DEFAULT NULL COMMENT '对网站的描述'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户的收藏夹';

-- ----------------------------
-- Records of userwebsite
-- ----------------------------

-- ----------------------------
-- Table structure for website
-- ----------------------------
DROP TABLE IF EXISTS `website`;
CREATE TABLE `website` (
  `url` varchar(255) NOT NULL,
  `logo` varchar(255) DEFAULT NULL,
  `kind` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL COMMENT '0是在申请，1是已上架，2是被下架',
  `name` varchar(50) DEFAULT NULL COMMENT '网站名称',
  `regeditTime` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `account` varchar(40) DEFAULT NULL COMMENT '发布用户',
  `good` int(11) DEFAULT '0',
  `bad` int(11) DEFAULT '0',
  `read` int(11) DEFAULT '0',
  `click` int(11) DEFAULT '0',
  PRIMARY KEY (`url`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='网站的标签';

-- ----------------------------
-- Records of website
-- ----------------------------

-- ----------------------------
-- Table structure for websitelog
-- ----------------------------
DROP TABLE IF EXISTS `websitelog`;
CREATE TABLE `websitelog` (
  `account` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of websitelog
-- ----------------------------

-- ----------------------------
-- Table structure for websitetab
-- ----------------------------
DROP TABLE IF EXISTS `websitetab`;
CREATE TABLE `websitetab` (
  `url` varchar(255) DEFAULT NULL,
  `tab` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of websitetab
-- ----------------------------
SET FOREIGN_KEY_CHECKS=1;
