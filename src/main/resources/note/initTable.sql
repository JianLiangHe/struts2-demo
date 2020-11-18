DROP TABLE IF EXISTS `t_dept`;
CREATE TABLE `t_dept` (
    dept_id INT PRIMARY KEY AUTO_INCREMENT COMMENT '����,����id',
    dept_name VARCHAR(20) UNIQUE COMMENT '��������',
    dept_createtime VARCHAR(30) COMMENT '����ʱ��',
    dept_status INT DEFAULT 0 COMMENT '״̬ 0:���� 1:����'
);

SELECT * FROM `t_dept` LIMIT 10;