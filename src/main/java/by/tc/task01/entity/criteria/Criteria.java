package by.tc.task01.entity.criteria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Criteria {

	private String groupSearchName;
	private Map<String, Object> criteria = new HashMap<String, Object>();

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}

	public String getGroupSearchName() {
		return groupSearchName;
	}

	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public Map<String, Object> getCriteriaMap() {
		return criteria;
	}

	public List<String> getKey() {
		List<String> keys = new ArrayList<String>();

		for (Map.Entry<String, Object> map : criteria.entrySet()) {
			keys.add(map.getKey());
		}

		return keys;
	}

	public Object getValue(String key) {
		return criteria.get(key);
	}

	@Override
	public String toString() {
		return "Criteria{" +
				"groupSearchName='" + groupSearchName + '\'' +
				", criteria=" + criteria +
				'}';
	}
}