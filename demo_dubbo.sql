/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : demo_dubbo

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2017-03-21 19:40:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `teacher`
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `birthday` datetime DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `post` varchar(255) DEFAULT NULL,
  `superviseclass_Id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_2lrxybqn1tke3riiy8fj594qp` (`superviseclass_Id`) USING BTREE,
  CONSTRAINT `teacher_ibfk_1` FOREIGN KEY (`superviseclass_Id`) REFERENCES `classes` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', null, '小贺', null, '1');
INSERT INTO `teacher` VALUES ('2', null, '小刘', null, '2');

-- ----------------------------
-- Table structure for `teacher_classes`
-- ----------------------------
DROP TABLE IF EXISTS `teacher_classes`;
CREATE TABLE `teacher_classes` (
  `teacher_id` bigint(20) NOT NULL,
  `classes_id` bigint(20) NOT NULL,
  PRIMARY KEY (`teacher_id`,`classes_id`),
  KEY `FK_et9codq50y2mx2uv6s3dljj2j` (`classes_id`) USING BTREE,
  CONSTRAINT `teacher_classes_ibfk_1` FOREIGN KEY (`classes_id`) REFERENCES `classes` (`id`),
  CONSTRAINT `teacher_classes_ibfk_2` FOREIGN KEY (`teacher_id`) REFERENCES `teacher` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of teacher_classes
-- ----------------------------
INSERT INTO `teacher_classes` VALUES ('1', '1');
INSERT INTO `teacher_classes` VALUES ('2', '1');
INSERT INTO `teacher_classes` VALUES ('1', '2');
INSERT INTO `teacher_classes` VALUES ('2', '2');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `loginName` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('2', 'heqing', 'heqing');
