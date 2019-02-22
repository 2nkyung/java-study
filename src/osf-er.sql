
/* Drop Tables */

DROP TABLE Board CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE Board
(
	-- 컬럼에 대한 설명
	-- 
	Num number(10,0) NOT NULL,
	Title varchar2(150) NOT NULL,
	Content varchar2(4000)
);



/* Comments */

COMMENT ON COLUMN Board.Num IS '컬럼에 대한 설명
';



