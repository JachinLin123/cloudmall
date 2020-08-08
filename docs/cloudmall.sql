/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : cloudmall

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 08/08/2020 09:25:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cart
-- ----------------------------
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `goodsname` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '商品名称',
  `number` int(11) NULL DEFAULT NULL COMMENT '数量',
  `price` int(11) NULL DEFAULT NULL COMMENT '商品单价',
  `goodid` int(11) NULL DEFAULT NULL COMMENT '商品ID',
  `uid` int(11) NULL DEFAULT NULL COMMENT '商品类别',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `gid` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品主键',
  `gname` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '商品名称',
  `gremain` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '商品图片',
  `gdetails` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '商品介绍',
  `gprice` int(11) NULL DEFAULT NULL COMMENT '商品价格',
  `types` int(64) NULL DEFAULT NULL COMMENT '商品类别',
  PRIMARY KEY (`gid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES (1, '草莓', 'http://localhost:8896/img/goods/goods003.jpg', '可口草莓', 4, 0);
INSERT INTO `goods` VALUES (2, '苹果', 'http://localhost:8896/img/2.jpg', '红富士苹果', 2, 0);
INSERT INTO `goods` VALUES (3, '橙子', 'http://localhost:8896/img/goods/goods001.jpg', '金黄的大橙子', 4, 0);
INSERT INTO `goods` VALUES (4, '葡萄', 'http://localhost:8896/img/goods/goods002.jpg', '吐鲁番葡萄', 12, 0);
INSERT INTO `goods` VALUES (5, '大虾', 'http://localhost:8896/img/goods/goods018.jpg', '山东大虾', 5, 2);
INSERT INTO `goods` VALUES (6, '带鱼', 'http://localhost:8896/img/goods/goods020.jpg', '好吃的带鱼', 50, 2);
INSERT INTO `goods` VALUES (7, '扇贝', 'http://localhost:8896/img/goods/goods019.jpg', '大神快来快来', 20, 2);
INSERT INTO `goods` VALUES (8, '皮皮虾', 'http://localhost:8896/img/goods/goods021.jpg', '啥的客户', 10, 2);
INSERT INTO `goods` VALUES (9, '脉动', 'http://localhost:8896/img/goods/maidong.png', '不在状态，脉动一下', 4, 1);
INSERT INTO `goods` VALUES (10, '汽水', 'http://localhost:8896/img/goods/qishui.png', '栓双', 8, 1);
INSERT INTO `goods` VALUES (11, '沙棘汁', 'http://localhost:8896/img/goods/shajizhi.png', '好喝', 3, 1);
INSERT INTO `goods` VALUES (12, '和其正', 'http://localhost:8896/img/goods/heqizheng.png', 'dsa asd', 5, 1);
INSERT INTO `goods` VALUES (13, '菠菜', 'http://localhost:8896/img/goods/bocai.png', '大', 2, 3);
INSERT INTO `goods` VALUES (14, '生菜', 'http://localhost:8896/img/goods/shengcai.png', 'asdajlskdja', 2, 3);
INSERT INTO `goods` VALUES (15, '番茄', 'http://localhost:8896/img/goods/fanqie.png', '好吃', 1, 3);
INSERT INTO `goods` VALUES (16, '胡萝卜', 'http://localhost:8896/img/goods/huluobo.png', 'asdkjlajkld', 2, 3);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `uaccount` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户账号',
  `upassword` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '用户密码',
  `uname` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '用户姓名',
  `usex` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '用户性别',
  PRIMARY KEY (`uaccount`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (5, '123456', 'root', '男');
INSERT INTO `user` VALUES (10018, '1', '12', 'WS');
INSERT INTO `user` VALUES (10019, '1', 'wangjin', '1');
INSERT INTO `user` VALUES (10020, '123', '王三', '男');
INSERT INTO `user` VALUES (10021, '1', '我', '男');
INSERT INTO `user` VALUES (10022, '1', '1211', '的');
INSERT INTO `user` VALUES (10023, '2', 'whhh', 'nan');
INSERT INTO `user` VALUES (10024, '1', 'whhh', 'nan');
INSERT INTO `user` VALUES (10025, '1', 'hh', 'nan');

-- ----------------------------
-- Table structure for userorder
-- ----------------------------
DROP TABLE IF EXISTS `userorder`;
CREATE TABLE `userorder`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品主键',
  `goodsname` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '商品名称',
  `number` int(11) NULL DEFAULT NULL COMMENT '购买数量',
  `price` int(11) NULL DEFAULT NULL COMMENT '总价',
  `time` datetime(6) NULL DEFAULT NULL COMMENT '购买时间',
  `uid` int(11) NULL DEFAULT NULL COMMENT '用户ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of userorder
-- ----------------------------
INSERT INTO `userorder` VALUES (139, '脉动', 17, 68, '2019-10-16 11:11:45.000000', 10023);
INSERT INTO `userorder` VALUES (140, '沙棘汁', 2, 6, '2019-10-16 11:11:45.000000', 10023);
INSERT INTO `userorder` VALUES (141, '和其正', 1, 5, '2020-08-07 22:03:57.000000', 5);
INSERT INTO `userorder` VALUES (142, '脉动', 6, 24, '2020-08-07 22:13:46.000000', 5);

SET FOREIGN_KEY_CHECKS = 1;
