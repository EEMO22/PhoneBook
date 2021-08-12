package phonebook;

import java.util.List;

public interface PhoneBookDAO {
	public List<PhoneBookVO> getList();
	public List<PhoneBookVO> search(String keyword);
	public PhoneBookVO get(Long id);
	public boolean insert(PhoneBookVO vo);
	public boolean update(PhoneBookVO vo);
	public boolean delete(Long id);
}
