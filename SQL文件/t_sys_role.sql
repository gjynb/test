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

 Date: 03/05/2020 23:50:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_sys_role
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_role`;
CREATE TABLE `t_sys_role`  (
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `role_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `is_deleted` tinyint(1) NULL DEFAULT NULL,
  `gmt_create` datetime(0) NULL,
  `create_by` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `gmt_modified` datetime(0) NULL,
  `last_modified_by` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `version` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_sys_role
-- ----------------------------
INSERT INTO `t_sys_role` VALUES ('1', '管理员', 1, '2020-05-03 11:17:03', '冯加豪', '2020-05-03 11:17:09', '冯加豪', 0);
INSERT INTO `t_sys_role` VALUES ('2', '店长', 0, '2020-05-03 11:17:40', '王小虎', '2020-05-03 11:17:51', '王小虎', 1);
INSERT INTO `t_sys_role` VALUES ('3', '普通用户', 0, '2020-05-03 11:18:13', '小张', '2020-05-03 11:18:19', '小明', 2);
INSERT INTO `t_sys_role` VALUES ('e86bff15-f883-4452-8676-52a55e3d1d5d', '管理员', 0, '2020-05-03 17:20:38', '王五', '2020-05-03 17:20:38', '王五', 1);

SET FOREIGN_KEY_CHECKS = 1;
