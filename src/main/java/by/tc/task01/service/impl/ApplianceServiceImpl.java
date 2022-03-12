package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

import java.io.IOException;
import java.util.List;


public class ApplianceServiceImpl implements ApplianceService {
	@Override
	public Appliance find(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}

		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		List<Appliance> appliances;

		try {
			appliances = applianceDAO.find(criteria);
		} catch (IOException e) {

			System.out.println("Data access layer Error.");
			return null;
		}

		for (int i = appliances.size() - 1; i >= 0; i--) {
			if (searchCriteria(appliances.get(i), criteria)) {
				appliances.remove(appliances.get(i));
			}
		}
		System.out.println(appliances);
		return appliances.get(0);
	}

	private boolean searchCriteria(Appliance appliance, Criteria criteria) {
		boolean flag = false;
		if (appliance.getName().equals(Oven.class.getSimpleName())) {
			SearchCriteria.Oven[] ovens = SearchCriteria.Oven.values();
			for (SearchCriteria.Oven oven : ovens) {
				if (criteria.getValue(oven.toString()) != null) {
					if (!appliance.toString().contains(criteria.getValue(oven.toString()).toString())) {
						flag = true;
					}
				}
			}
		} else if (appliance.getName().equals(SearchCriteria.Laptop.class.getSimpleName())) {
			SearchCriteria.Laptop[] laptops = SearchCriteria.Laptop.values();
			for (SearchCriteria.Laptop laptop : laptops) {
				if (criteria.getValue(laptop.toString()) != null) {
					if (!appliance.toString().contains(criteria.getValue(laptop.toString()).toString())) {
						flag = true;
					}
				}
			}
		} else if (appliance.getName().equals(SearchCriteria.Refrigerator.class.getSimpleName())) {
			SearchCriteria.Refrigerator[] refrigerators = SearchCriteria.Refrigerator.values();
			for (SearchCriteria.Refrigerator refrigerator : refrigerators) {
				if (criteria.getValue(refrigerator.toString()) != null) {
					if (!appliance.toString().contains(criteria.getValue(refrigerator.toString()).toString())) {
						flag = true;
					}
				}
			}
		} else if (appliance.getName().equals(SearchCriteria.Speakers.class.getSimpleName())) {
			SearchCriteria.Speakers[] speakers = SearchCriteria.Speakers.values();
			for (SearchCriteria.Speakers speak : speakers) {
				if (criteria.getValue(speak.toString()) != null) {
					if (!appliance.toString().contains(criteria.getValue(speak.toString()).toString())) {
						flag = true;
					}
				}
			}
		} else if (appliance.getName().equals(SearchCriteria.TabletPC.class.getSimpleName())) {
			SearchCriteria.TabletPC[] tabletPCS = SearchCriteria.TabletPC.values();
			for (SearchCriteria.TabletPC tabletPC : tabletPCS) {
				if (criteria.getValue(tabletPC.toString()) != null) {
					if (!appliance.toString().contains(criteria.getValue(tabletPC.toString()).toString())) {
						flag = true;
					}
				}
			}
		} else if (appliance.getName().equals(SearchCriteria.VacuumCleaner.class.getSimpleName())) {
			SearchCriteria.VacuumCleaner[] vacuumCleaners = SearchCriteria.VacuumCleaner.values();
			for (SearchCriteria.VacuumCleaner vacuumCleaner : vacuumCleaners) {
				if (criteria.getValue(vacuumCleaner.toString()) != null) {
					if (!appliance.toString().contains(criteria.getValue(vacuumCleaner.toString()).toString())) {
						flag = true;
					}
				}
			}
		}

		return flag;
	}
}