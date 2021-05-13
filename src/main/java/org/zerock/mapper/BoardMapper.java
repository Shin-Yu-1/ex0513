/*package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.zerock.domain.BoardVO;

public interface BoardMapper {
	@Select("SELECT * FROM tble_board where bon > 0")
	//BoardVO를 담을거임
	public List<BoardVO> getList();
}
*/
package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.zerock.domain.BoardVO;

public interface BoardMapper {
   @Select("select * from tbl_board where bno > 0")
   public List<BoardVO> getList();
   
}