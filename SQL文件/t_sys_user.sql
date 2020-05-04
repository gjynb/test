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

 Date: 03/05/2020 23:59:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_sys_user
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_user`;
CREATE TABLE `t_sys_user`  (
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '数据id',
  `user_acct` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '账号',
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `sex` tinyint(1) NULL DEFAULT NULL COMMENT '0-女 1-男',
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `id_card` char(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `is_deleted` tinyint(1) NOT NULL COMMENT '作废标记（1作废，0未作废）',
  `sort_no` int(11) NOT NULL COMMENT '序号（从0开始）',
  `gmt_create` datetime(0) NOT NULL COMMENT '创建时间',
  `create_by` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '创建者(登录账号)',
  `gmt_modified` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  `last_modified_by` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL COMMENT '更新者(登录账号)',
  `version` int(11) NOT NULL COMMENT '版本号',
  `user_pwd` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_sys_user
-- ----------------------------
INSERT INTO `t_sys_user` VALUES ('1', '2017010392', '冯加豪', 1, '1310558619', '1164764344@qq.com', '1234', 1, 0, '2020-05-03 11:16:11', '冯加豪', '2020-05-03 11:16:19', '冯加豪', 0, '123456');
INSERT INTO `t_sys_user` VALUES ('185a3908-1174-4c72-8937-fbf998ff22a6', '20170103921', '小张H', 0, '12345', '1164764344@qq.com', '123456', 0, 0, '2020-05-03 12:46:30', '冯加豪', '2020-05-03 12:46:30', '冯加豪', 0, '12345678');
INSERT INTO `t_sys_user` VALUES ('2', '32020001', '王小虎', 1, '15091389275', '3427417497@qq.com', '12345', 0, 0, '2020-05-03 11:21:32', '王小虎', '2020-05-03 11:21:37', '王小虎', 1, '1234567');

SET FOREIGN_KEY_CHECKS = 1;
