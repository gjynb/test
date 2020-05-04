/*
 Navicat Premium Data Transfer

 Source Server         : test02
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : localhost:3306
 Source Schema         : test02

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 03/05/2020 23:50:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_role_user_middle
-- ----------------------------
DROP TABLE IF EXISTS `t_role_user_middle`;
CREATE TABLE `t_role_user_middle`  (
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `role_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `user_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `is_deleted` tinyint(1) NULL DEFAULT NULL,
  `gmt_create` datetime(0) NULL,
  `create_by` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `gmt_modified` datetime(0) NULL,
  `last_modified_by` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `version` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_role_user_middle
-- ----------------------------
INSERT INTO `t_role_user_middle` VALUES ('1', '3', '1', 0, '2020-05-03 11:18:52', '冯加豪', '2020-05-03 11:19:00', '冯加豪', 0);
INSERT INTO `t_role_user_middle` VALUES ('2', '2', '2', 0, '2020-05-03 11:19:27', '王小虎', '2020-05-03 11:19:32', '王小虎', 1);

SET FOREIGN_KEY_CHECKS = 1;
