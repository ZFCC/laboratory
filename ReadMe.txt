1.创建上传文件表

CREATE TABLE `file_uploade` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `number` varchar(20) NOT NULL,
  `user_name` varchar(50) NOT NULL COMMENT '姓名',
  `path` varchar(255) DEFAULT NULL COMMENT '文件路径',
  `file_name` varchar(255) DEFAULT NULL COMMENT '文件名称',
  `create_time` date DEFAULT NULL COMMENT '创建时间',
  `update_time` date DEFAULT NULL COMMENT '更新时间',
  `remark` text COMMENT '备注',
  PRIMARY KEY (`id`),
  KEY `file_uploade_idx_2` (`user_name`) USING BTREE,
  KEY `file_uploade_idx_1` (`number`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8

2.创建上传文件目录（本地磁盘 E:/Develop/Files/Photos）