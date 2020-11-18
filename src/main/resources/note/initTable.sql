DROP TABLE IF EXISTS `t_dept`;
CREATE TABLE `t_dept` (
    dept_id INT PRIMARY KEY AUTO_INCREMENT COMMENT '主键,自增id',
    dept_name VARCHAR(20) UNIQUE COMMENT '部门名称',
    dept_createtime VARCHAR(30) COMMENT '创建时间',
    dept_status INT DEFAULT 0 COMMENT '状态 0:禁用 1:启用'
);

SELECT * FROM `t_dept` LIMIT 10;