/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : mental_health

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 30/06/2024 23:05:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for chat
-- ----------------------------
DROP TABLE IF EXISTS `chat`;
CREATE TABLE `chat`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `userid` bigint(0) NOT NULL COMMENT '用户id',
  `adminid` bigint(0) NULL DEFAULT NULL COMMENT '管理员id',
  `ask` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '提问',
  `reply` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '回复',
  `isreply` int(0) NULL DEFAULT NULL COMMENT '是否回复',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 87 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '在线咨询' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of chat
-- ----------------------------
INSERT INTO `chat` VALUES (81, '2024-04-13 11:10:38', 1, 1, '提问1', '回复1', 1);
INSERT INTO `chat` VALUES (82, '2024-04-13 11:10:38', 2, 2, '提问2', '回复2', 2);
INSERT INTO `chat` VALUES (83, '2024-04-13 11:10:38', 3, 3, '提问3', '回复3', 3);
INSERT INTO `chat` VALUES (84, '2024-04-13 11:10:38', 4, 4, '提问4', '回复4', 4);
INSERT INTO `chat` VALUES (85, '2024-04-13 11:10:38', 5, 5, '提问5', '回复5', 5);
INSERT INTO `chat` VALUES (86, '2024-04-13 11:10:38', 6, 6, '提问6', '回复6', 6);

-- ----------------------------
-- Table structure for config
-- ----------------------------
DROP TABLE IF EXISTS `config`;
CREATE TABLE `config`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '配置文件' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of config
-- ----------------------------
INSERT INTO `config` VALUES (1, 'picture1', 'upload/1719758186546.JPG');
INSERT INTO `config` VALUES (2, 'picture2', 'upload/1719758455636.JPG');
INSERT INTO `config` VALUES (3, 'picture3', 'upload/1719759397785.JPG');

-- ----------------------------
-- Table structure for discussjianyadabenying
-- ----------------------------
DROP TABLE IF EXISTS `discussjianyadabenying`;
CREATE TABLE `discussjianyadabenying`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `refid` bigint(0) NOT NULL COMMENT '关联表id',
  `userid` bigint(0) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '评论内容',
  `reply` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '回复内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 137 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '减压大本营评论表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of discussjianyadabenying
-- ----------------------------
INSERT INTO `discussjianyadabenying` VALUES (131, '2024-04-13 11:10:38', 1, 1, '用户名1', '评论内容1', '回复内容1');
INSERT INTO `discussjianyadabenying` VALUES (132, '2024-04-13 11:10:38', 2, 2, '用户名2', '评论内容2', '回复内容2');
INSERT INTO `discussjianyadabenying` VALUES (133, '2024-04-13 11:10:38', 3, 3, '用户名3', '评论内容3', '回复内容3');
INSERT INTO `discussjianyadabenying` VALUES (134, '2024-04-13 11:10:38', 4, 4, '用户名4', '评论内容4', '回复内容4');
INSERT INTO `discussjianyadabenying` VALUES (135, '2024-04-13 11:10:38', 5, 5, '用户名5', '评论内容5', '回复内容5');
INSERT INTO `discussjianyadabenying` VALUES (136, '2024-04-13 11:10:38', 6, 6, '用户名6', '评论内容6', '回复内容6');

-- ----------------------------
-- Table structure for discussyinlexinxi
-- ----------------------------
DROP TABLE IF EXISTS `discussyinlexinxi`;
CREATE TABLE `discussyinlexinxi`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `refid` bigint(0) NOT NULL COMMENT '关联表id',
  `userid` bigint(0) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `content` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '评论内容',
  `reply` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '回复内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 147 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '音乐信息评论表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of discussyinlexinxi
-- ----------------------------
INSERT INTO `discussyinlexinxi` VALUES (141, '2024-04-13 11:10:38', 1, 1, '用户名1', '评论内容1', '回复内容1');
INSERT INTO `discussyinlexinxi` VALUES (142, '2024-04-13 11:10:38', 2, 2, '用户名2', '评论内容2', '回复内容2');
INSERT INTO `discussyinlexinxi` VALUES (143, '2024-04-13 11:10:38', 3, 3, '用户名3', '评论内容3', '回复内容3');
INSERT INTO `discussyinlexinxi` VALUES (144, '2024-04-13 11:10:38', 4, 4, '用户名4', '评论内容4', '回复内容4');
INSERT INTO `discussyinlexinxi` VALUES (145, '2024-04-13 11:10:38', 5, 5, '用户名5', '评论内容5', '回复内容5');
INSERT INTO `discussyinlexinxi` VALUES (146, '2024-04-13 11:10:38', 6, 6, '用户名6', '评论内容6', '回复内容6');

-- ----------------------------
-- Table structure for exampaper
-- ----------------------------
DROP TABLE IF EXISTS `exampaper`;
CREATE TABLE `exampaper`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '调查问卷名称',
  `time` int(0) NOT NULL COMMENT '考试时长(分钟)',
  `status` int(0) NOT NULL DEFAULT 0 COMMENT '调查问卷状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '调查问卷表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of exampaper
-- ----------------------------
INSERT INTO `exampaper` VALUES (1, '2024-04-13 11:10:38', '十万个为什么', 60, 1);

-- ----------------------------
-- Table structure for examquestion
-- ----------------------------
DROP TABLE IF EXISTS `examquestion`;
CREATE TABLE `examquestion`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `paperid` bigint(0) NOT NULL COMMENT '所属调查问卷id（外键）',
  `papername` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '调查问卷名称',
  `questionname` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '心理试题名称',
  `options` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '选项，json字符串',
  `score` bigint(0) NULL DEFAULT 0 COMMENT '分值',
  `answer` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '正确答案',
  `analysis` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '答案解析',
  `type` bigint(0) NULL DEFAULT 0 COMMENT '心理试题类型，0：单选题 1：多选题 2：判断题 3：填空题（暂不考虑多项填空）',
  `sequence` bigint(0) NULL DEFAULT 100 COMMENT '心理试题排序，值越大排越前面',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '心理试题' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of examquestion
-- ----------------------------
INSERT INTO `examquestion` VALUES (1, '2024-04-13 11:10:38', 1, '十万个为什么', '下面动物不属于昆虫的是（）。', '[{\"text\":\"A.苍蝇\",\"code\":\"A\"},{\"text\":\"B.蜜蜂\",\"code\":\"B\"},{\"text\":\"C.蜂鸟\",\"code\":\"C\"}]', 20, 'C', '蜂鸟', 0, 1);
INSERT INTO `examquestion` VALUES (2, '2024-04-13 11:10:38', 1, '十万个为什么', '油着火后可以用水扑灭。', '[{\"text\":\"A.对\",\"code\":\"A\"},{\"text\":\"B.错\",\"code\":\"B\"}]', 20, 'B', '油着火后不可以用水扑灭', 2, 2);
INSERT INTO `examquestion` VALUES (3, '2024-04-13 11:10:38', 1, '十万个为什么', '地球是个球体，中间是（ ）。', '[]', 30, '赤道', '赤道', 3, 3);
INSERT INTO `examquestion` VALUES (4, '2024-04-13 11:10:38', 1, '十万个为什么', '下面动物中会流汗的有（ ）。', '[{\"text\":\"A.马\",\"code\":\"A\"},{\"text\":\"B.猫\",\"code\":\"B\"},{\"text\":\"C.狗\",\"code\":\"C\"}]', 30, 'A,B', '狗不会流汗', 1, 4);

-- ----------------------------
-- Table structure for examrecord
-- ----------------------------
DROP TABLE IF EXISTS `examrecord`;
CREATE TABLE `examrecord`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `userid` bigint(0) NOT NULL COMMENT '用户id',
  `username` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `paperid` bigint(0) NOT NULL COMMENT '调查问卷id（外键）',
  `papername` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '调查问卷名称',
  `questionid` bigint(0) NOT NULL COMMENT '心理试题id（外键）',
  `questionname` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '心理试题名称',
  `options` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '选项，json字符串',
  `score` bigint(0) NULL DEFAULT 0 COMMENT '分值',
  `answer` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '正确答案',
  `analysis` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '答案解析',
  `myscore` bigint(0) NOT NULL DEFAULT 0 COMMENT '心理试题得分',
  `myanswer` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '考生答案',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '考试记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of examrecord
-- ----------------------------

-- ----------------------------
-- Table structure for jianyadabenying
-- ----------------------------
DROP TABLE IF EXISTS `jianyadabenying`;
CREATE TABLE `jianyadabenying`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `shipinbianhao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '视频编号',
  `shipinmingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '视频名称',
  `leixing` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '类型',
  `shipinfengmian` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '视频封面',
  `shipinbofang` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '视频播放',
  `shipinjieshao` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '视频介绍',
  `faburiqi` date NULL DEFAULT NULL COMMENT '发布日期',
  `thumbsupnum` int(0) NULL DEFAULT 0 COMMENT '赞',
  `crazilynum` int(0) NULL DEFAULT 0 COMMENT '踩',
  `clicktime` datetime(0) NULL DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(0) NULL DEFAULT 0 COMMENT '点击次数',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `shipinbianhao`(`shipinbianhao`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 47 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '减压大本营' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of jianyadabenying
-- ----------------------------
INSERT INTO `jianyadabenying` VALUES (41, '2024-04-13 11:10:38', '1111111111', '视频名称1', '类型1', 'upload/jianyadabenying_shipinfengmian1.jpg', '', '视频介绍1', '2024-04-13', 1, 1, '2024-06-30 22:45:02', 4);
INSERT INTO `jianyadabenying` VALUES (42, '2024-04-13 11:10:38', '2222222222', '视频名称2', '类型2', 'upload/jianyadabenying_shipinfengmian2.jpg', '', '视频介绍2', '2024-04-13', 2, 2, '2024-04-13 19:10:38', 2);
INSERT INTO `jianyadabenying` VALUES (43, '2024-04-13 11:10:38', '3333333333', '视频名称3', '类型3', 'upload/jianyadabenying_shipinfengmian3.jpg', '', '视频介绍3', '2024-04-13', 3, 3, '2024-04-13 19:10:38', 3);
INSERT INTO `jianyadabenying` VALUES (44, '2024-04-13 11:10:38', '4444444444', '视频名称4', '类型4', 'upload/jianyadabenying_shipinfengmian4.jpg', '', '视频介绍4', '2024-04-13', 4, 4, '2024-04-13 19:10:38', 4);
INSERT INTO `jianyadabenying` VALUES (45, '2024-04-13 11:10:38', '5555555555', '视频名称5', '类型5', 'upload/jianyadabenying_shipinfengmian5.jpg', '', '视频介绍5', '2024-04-13', 5, 5, '2024-06-30 22:47:40', 6);
INSERT INTO `jianyadabenying` VALUES (46, '2024-04-13 11:10:38', '6666666666', '视频名称6', '类型6', 'upload/jianyadabenying_shipinfengmian6.jpg', '', '视频介绍6', '2024-04-13', 6, 6, '2024-04-13 19:10:38', 6);

-- ----------------------------
-- Table structure for leixing
-- ----------------------------
DROP TABLE IF EXISTS `leixing`;
CREATE TABLE `leixing`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `leixing` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '类型',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `leixing`(`leixing`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 37 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '类型' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of leixing
-- ----------------------------
INSERT INTO `leixing` VALUES (31, '2024-04-13 11:10:38', '类型1');
INSERT INTO `leixing` VALUES (32, '2024-04-13 11:10:38', '类型2');
INSERT INTO `leixing` VALUES (33, '2024-04-13 11:10:38', '类型3');
INSERT INTO `leixing` VALUES (34, '2024-04-13 11:10:38', '类型4');
INSERT INTO `leixing` VALUES (35, '2024-04-13 11:10:38', '类型5');
INSERT INTO `leixing` VALUES (36, '2024-04-13 11:10:38', '类型6');

-- ----------------------------
-- Table structure for storeup
-- ----------------------------
DROP TABLE IF EXISTS `storeup`;
CREATE TABLE `storeup`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `userid` bigint(0) NOT NULL COMMENT '用户id',
  `refid` bigint(0) NULL DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '表名',
  `name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '收藏图片',
  `type` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '1' COMMENT '类型(1:收藏,21:赞,22:踩)',
  `inteltype` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '推荐类型',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '收藏表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of storeup
-- ----------------------------

-- ----------------------------
-- Table structure for token
-- ----------------------------
DROP TABLE IF EXISTS `token`;
CREATE TABLE `token`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(0) NOT NULL COMMENT '用户id',
  `username` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `tablename` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '表名',
  `role` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色',
  `token` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '新增时间',
  `expiratedtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '过期时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'token表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of token
-- ----------------------------
INSERT INTO `token` VALUES (1, 1, 'abo', 'users', '管理员', 'dmuj97tw33ehm6jn7peeogbpr5m8cdkx', '2024-04-13 11:46:33', '2024-06-30 23:55:45');
INSERT INTO `token` VALUES (2, 11, '学号1', 'xuesheng', '学生', 'pa9pu9lfppkqp4yyqsn3l4d2chawl6zr', '2024-06-30 22:44:47', '2024-06-30 23:52:45');
INSERT INTO `token` VALUES (3, 21, '00001', 'xinlijiaoshi', '管理员', 'e9bnu50e3knh00u0f9kz4mchse6vznom', '2024-06-30 22:57:31', '2024-06-30 23:57:31');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `role` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '新增时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, 'admin', '123456', '管理员', '2024-04-13 11:10:38');

-- ----------------------------
-- Table structure for xinlijiaoshi
-- ----------------------------
DROP TABLE IF EXISTS `xinlijiaoshi`;
CREATE TABLE `xinlijiaoshi`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `jiaoshigonghao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教师工号',
  `mima` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `jiaoshixingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教师姓名',
  `xingbie` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `zhicheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '职称',
  `dianhua` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '电话',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `jiaoshigonghao`(`jiaoshigonghao`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '心理教师' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of xinlijiaoshi
-- ----------------------------
INSERT INTO `xinlijiaoshi` VALUES (21, '2024-04-13 11:10:38', '00001', '123456', '教师姓名1', '男', '职称1', '13823888881');
INSERT INTO `xinlijiaoshi` VALUES (22, '2024-04-13 11:10:38', '00002', '123456', '教师姓名2', '男', '职称2', '13823888882');
INSERT INTO `xinlijiaoshi` VALUES (23, '2024-04-13 11:10:38', '00003', '123456', '教师姓名3', '男', '职称3', '13823888883');
INSERT INTO `xinlijiaoshi` VALUES (24, '2024-04-13 11:10:38', '00004', '123456', '教师姓名4', '男', '职称4', '13823888884');
INSERT INTO `xinlijiaoshi` VALUES (25, '2024-04-13 11:10:38', '00005', '123456', '教师姓名5', '男', '职称5', '13823888885');
INSERT INTO `xinlijiaoshi` VALUES (26, '2024-04-13 11:10:38', '00006', '123456', '教师姓名6', '男', '职称6', '13823888886');

-- ----------------------------
-- Table structure for xuesheng
-- ----------------------------
DROP TABLE IF EXISTS `xuesheng`;
CREATE TABLE `xuesheng`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `xuehao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学号',
  `xingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '姓名',
  `mima` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `xingbie` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `nianling` int(0) NULL DEFAULT NULL COMMENT '年龄',
  `shouji` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机',
  `xueyuan` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学院',
  `zhuanye` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '专业',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `xuehao`(`xuehao`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '学生' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of xuesheng
-- ----------------------------
INSERT INTO `xuesheng` VALUES (11, '2024-04-13 11:10:38', '600001', '姓名1', '123456', '男', 1, '13823888881', '学院1', '专业1');
INSERT INTO `xuesheng` VALUES (12, '2024-04-13 11:10:38', '600002', '姓名2', '123456', '男', 2, '13823888882', '学院2', '专业2');
INSERT INTO `xuesheng` VALUES (13, '2024-04-13 11:10:38', '600003', '姓名3', '123456', '男', 3, '13823888883', '学院3', '专业3');
INSERT INTO `xuesheng` VALUES (14, '2024-04-13 11:10:38', '600004', '姓名4', '123456', '男', 4, '13823888884', '学院4', '专业4');
INSERT INTO `xuesheng` VALUES (15, '2024-04-13 11:10:38', '600005', '姓名5', '123456', '男', 5, '13823888885', '学院5', '专业5');
INSERT INTO `xuesheng` VALUES (16, '2024-04-13 11:10:38', '600006', '姓名6', '123456', '男', 6, '13823888886', '学院6', '专业6');

-- ----------------------------
-- Table structure for xueshengxinlijiankang
-- ----------------------------
DROP TABLE IF EXISTS `xueshengxinlijiankang`;
CREATE TABLE `xueshengxinlijiankang`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `xuehao` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学号',
  `xingming` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `jiankangzhuangtai` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '健康状态',
  `xinlijibing` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '心里疾病',
  `jiankangpingjia` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '健康评价',
  `dengjishijian` date NULL DEFAULT NULL COMMENT '登记时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 77 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '学生心理健康' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of xueshengxinlijiankang
-- ----------------------------
INSERT INTO `xueshengxinlijiankang` VALUES (71, '2024-04-13 11:10:38', '学号1', '姓名1', '优', '有', '健康评价1', '2024-04-13');
INSERT INTO `xueshengxinlijiankang` VALUES (72, '2024-04-13 11:10:38', '学号2', '姓名2', '优', '有', '健康评价2', '2024-04-13');
INSERT INTO `xueshengxinlijiankang` VALUES (73, '2024-04-13 11:10:38', '学号3', '姓名3', '优', '有', '健康评价3', '2024-04-13');
INSERT INTO `xueshengxinlijiankang` VALUES (74, '2024-04-13 11:10:38', '学号4', '姓名4', '优', '有', '健康评价4', '2024-04-13');
INSERT INTO `xueshengxinlijiankang` VALUES (75, '2024-04-13 11:10:38', '学号5', '姓名5', '优', '有', '健康评价5', '2024-04-13');
INSERT INTO `xueshengxinlijiankang` VALUES (76, '2024-04-13 11:10:38', '学号6', '姓名6', '优', '有', '健康评价6', '2024-04-13');

-- ----------------------------
-- Table structure for yinleleixing
-- ----------------------------
DROP TABLE IF EXISTS `yinleleixing`;
CREATE TABLE `yinleleixing`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `yinleleixing` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '音乐类型',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `yinleleixing`(`yinleleixing`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 57 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '音乐类型' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of yinleleixing
-- ----------------------------
INSERT INTO `yinleleixing` VALUES (51, '2024-04-13 11:10:38', '音乐类型1');
INSERT INTO `yinleleixing` VALUES (52, '2024-04-13 11:10:38', '音乐类型2');
INSERT INTO `yinleleixing` VALUES (53, '2024-04-13 11:10:38', '音乐类型3');
INSERT INTO `yinleleixing` VALUES (54, '2024-04-13 11:10:38', '音乐类型4');
INSERT INTO `yinleleixing` VALUES (55, '2024-04-13 11:10:38', '音乐类型5');
INSERT INTO `yinleleixing` VALUES (56, '2024-04-13 11:10:38', '音乐类型6');

-- ----------------------------
-- Table structure for yinlexinxi
-- ----------------------------
DROP TABLE IF EXISTS `yinlexinxi`;
CREATE TABLE `yinlexinxi`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `yinlemingcheng` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '音乐名称',
  `yinleleixing` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '音乐类型',
  `fengmian` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '封面',
  `geshou` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '歌手',
  `shizhang` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '时长',
  `yinpin` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '音频',
  `MV` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'MV',
  `faxingriqi` date NULL DEFAULT NULL COMMENT '发行日期',
  `geci` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '歌词',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 67 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '音乐信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of yinlexinxi
-- ----------------------------
INSERT INTO `yinlexinxi` VALUES (61, '2024-04-13 11:10:38', '音乐名称1', '音乐类型1', 'upload/yinlexinxi_fengmian1.jpg', '歌手1', '时长1', '', '', '2024-04-13', '歌词1');
INSERT INTO `yinlexinxi` VALUES (62, '2024-04-13 11:10:38', '音乐名称2', '音乐类型2', 'upload/yinlexinxi_fengmian2.jpg', '歌手2', '时长2', '', '', '2024-04-13', '歌词2');
INSERT INTO `yinlexinxi` VALUES (63, '2024-04-13 11:10:38', '音乐名称3', '音乐类型3', 'upload/yinlexinxi_fengmian3.jpg', '歌手3', '时长3', '', '', '2024-04-13', '歌词3');
INSERT INTO `yinlexinxi` VALUES (64, '2024-04-13 11:10:38', '音乐名称4', '音乐类型4', 'upload/yinlexinxi_fengmian4.jpg', '歌手4', '时长4', '', '', '2024-04-13', '歌词4');
INSERT INTO `yinlexinxi` VALUES (65, '2024-04-13 11:10:38', '音乐名称5', '音乐类型5', 'upload/yinlexinxi_fengmian5.jpg', '歌手5', '时长5', '', '', '2024-04-13', '歌词5');
INSERT INTO `yinlexinxi` VALUES (66, '2024-04-13 11:10:38', '音乐名称6', '音乐类型6', 'upload/yinlexinxi_fengmian6.jpg', '歌手6', '时长6', '', '', '2024-04-13', '歌词6');

SET FOREIGN_KEY_CHECKS = 1;
