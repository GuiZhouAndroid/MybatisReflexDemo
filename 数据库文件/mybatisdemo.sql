/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : mybatisdemo

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 22/04/2022 21:12:06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of class
-- ----------------------------
INSERT INTO `class` VALUES (1, '计科一班');
INSERT INTO `class` VALUES (2, '计科二班');
INSERT INTO `class` VALUES (3, '计科三班');

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES (1, '张松1', 18);
INSERT INTO `customer` VALUES (2, '张松2', 19);
INSERT INTO `customer` VALUES (3, '张松3', 20);

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `customer_id` int NULL DEFAULT NULL,
  `orderNumber` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `orderPrice` double NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `customer_id`(`customer_id`) USING BTREE,
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES (1, 2, 'qweqdasdqw1213', 100);
INSERT INTO `orders` VALUES (2, 2, 'gdfgfdgwre131', 200);
INSERT INTO `orders` VALUES (3, 3, 'vxcvfgfdgfhfd231', 300);

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `role_id` int NOT NULL AUTO_INCREMENT,
  `role_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `role_describe` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES (1, '管理员', '管理整个系统');
INSERT INTO `role` VALUES (2, '商家', '经营旗下店铺');
INSERT INTO `role` VALUES (3, '普通用户', '使用对象');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 47 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES (1, 'zs1', '121076262@qq.com', 23);
INSERT INTO `student` VALUES (2, 'zs2', '1211232132@qq.com', 223);
INSERT INTO `student` VALUES (10, 'haha', 'youxiang', 100);
INSERT INTO `student` VALUES (12, '李四', 'qwe', 13);
INSERT INTO `student` VALUES (14, '李四', 'qwe', 13);
INSERT INTO `student` VALUES (15, '李四qweqwe', 'qwe', 13);
INSERT INTO `student` VALUES (17, 'QWE', 'QWE', 1);
INSERT INTO `student` VALUES (18, '张松', 'ZXC', 2);
INSERT INTO `student` VALUES (19, 'ZXC', 'ZXC', 3);
INSERT INTO `student` VALUES (20, '李四', 'qwe', 13);
INSERT INTO `student` VALUES (21, '李wsdse', 'qwe', 13);
INSERT INTO `student` VALUES (22, '李四', 'qwe', 13);
INSERT INTO `student` VALUES (23, '李wsdse', 'qwe', 13);
INSERT INTO `student` VALUES (24, 'QWE', 'QWE', 1);
INSERT INTO `student` VALUES (25, 'ASD', 'ZXC', 2);
INSERT INTO `student` VALUES (26, 'QWE', 'QWE', 1);
INSERT INTO `student` VALUES (27, 'ASD', 'ZXC', 2);
INSERT INTO `student` VALUES (28, 'ZXC', 'ZXC', 3);
INSERT INTO `student` VALUES (29, 'QWE', 'QWE', 1);
INSERT INTO `student` VALUES (30, 'ASD', 'ZXC', 2);
INSERT INTO `student` VALUES (31, 'ZXC', 'ZXC', 3);
INSERT INTO `student` VALUES (32, 'QWE', 'QWE', 1);
INSERT INTO `student` VALUES (33, 'ASD', 'ZXC', 2);
INSERT INTO `student` VALUES (34, 'ZXC', 'ZXC', 3);
INSERT INTO `student` VALUES (35, 'QWE', 'QWE', 1);
INSERT INTO `student` VALUES (36, 'ASD', 'ZXC', 2);
INSERT INTO `student` VALUES (37, 'ZXC', 'ZXC', 3);
INSERT INTO `student` VALUES (38, 'QWE', 'QWE', 1);
INSERT INTO `student` VALUES (39, 'ASD', 'ZXC', 2);
INSERT INTO `student` VALUES (40, 'ZXC', 'ZXC', 3);
INSERT INTO `student` VALUES (41, 'QWE', 'QWE', 1);
INSERT INTO `student` VALUES (42, 'ASD', 'ZXC', 2);
INSERT INTO `student` VALUES (43, 'ZXC', 'ZXC', 3);
INSERT INTO `student` VALUES (44, 'QWE', 'QWE', 1);
INSERT INTO `student` VALUES (45, 'ASD', 'ZXC', 2);
INSERT INTO `student` VALUES (46, 'ZXC', 'ZXC', 3);

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `class_id` int NULL DEFAULT NULL,
  `name` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `class_id`(`class_id`) USING BTREE,
  CONSTRAINT `teacher_ibfk_1` FOREIGN KEY (`class_id`) REFERENCES `class` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES (1, 1, '老师1', 20);
INSERT INTO `teacher` VALUES (2, 2, '老师2', 30);
INSERT INTO `teacher` VALUES (3, 3, '老师3', 40);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `address` varchar(60) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '张松1', '贵阳1');
INSERT INTO `user` VALUES (2, '张松2', '贵阳2');
INSERT INTO `user` VALUES (3, '张松3', '贵阳3');
INSERT INTO `user` VALUES (4, '张松4', '贵阳4');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role`  (
  `user_id` int NULL DEFAULT NULL,
  `role_id` int NULL DEFAULT NULL,
  INDEX `user_id`(`user_id`) USING BTREE,
  INDEX `role_id`(`role_id`) USING BTREE,
  CONSTRAINT `user_role_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `user_role_ibfk_2` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES (1, 1);
INSERT INTO `user_role` VALUES (1, 2);
INSERT INTO `user_role` VALUES (1, 3);
INSERT INTO `user_role` VALUES (2, 2);
INSERT INTO `user_role` VALUES (3, 3);

SET FOREIGN_KEY_CHECKS = 1;
