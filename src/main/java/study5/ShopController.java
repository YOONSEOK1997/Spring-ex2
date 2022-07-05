package study5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import study4.ShopDto;

@Component("myshop") //myshop�� ���̵�� ���
public class ShopController {
	@Autowired //����Ÿ���� ã�Ƽ� �ڵ�����
	MysqlDao dao;
	
	public ShopController(MysqlDao dao) {
		this.dao=dao;
	}
	
	public void add(String sang,int price)
	{
		ShopDto dto=new ShopDto();
		dto.setSangpum(sang);
		dto.setPrice(price);
		
		dao.insertShop(dto);
	}
	public void delete(String sang) {
		dao.deleteShop(sang);
	}
}