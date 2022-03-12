package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.PropertyRead;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class FileApplianceDAOImpl implements ApplianceDAO {

	@Override
	public List<Appliance> find(Criteria criteria) throws IOException {
		List<String> list;
		try {
			list = PropertyRead.readDoc(criteria);
		} catch (IOException e) {
			throw new IOException();
		}

		List<Appliance> appliance = new ArrayList<>();

		for (String temp : list) {
			Map<String, Object> inf = PropertyRead.parsing(temp);
			switch (criteria.getGroupSearchName()) {
				case ("Laptop"):
					Laptop laptop = new Laptop();
					laptop.setName(criteria.getGroupSearchName());
					laptop.setMemoryRom(Integer.parseInt((String) inf.get(SearchCriteria.Laptop.SYSTEM_MEMORY.toString())));
					laptop.setSystemMemory(Integer.parseInt((String) inf.get(SearchCriteria.Laptop.SYSTEM_MEMORY.toString())));
					laptop.setDisplayInchs(Integer.parseInt((String) inf.get(SearchCriteria.Laptop.DISPLAY_INCHS.toString())));
					laptop.setBatteryCapacity(Double.parseDouble((String) inf.get(SearchCriteria.Laptop.BATTERY_CAPACITY.toString())));
					laptop.setCpu(Double.parseDouble((String) inf.get(SearchCriteria.Laptop.CPU.toString())));
					laptop.setOs((String) inf.get(SearchCriteria.Laptop.OS.toString()));
					appliance.add(laptop);
					break;
				case ("Oven"):
					Oven oven = new Oven();
					oven.setName(criteria.getGroupSearchName());
					oven.setCapacity(Integer.parseInt((String) inf.get(SearchCriteria.Oven.CAPACITY.toString())));
					oven.setDepth(Integer.parseInt((String) inf.get(SearchCriteria.Oven.DEPTH.toString())));
					oven.setPowerConsumption(Integer.parseInt((String) inf.get(SearchCriteria.Oven.POWER_CONSUMPTION.toString())));
					oven.setHeight(Double.parseDouble((String) inf.get(SearchCriteria.Oven.HEIGHT.toString())));
					oven.setWeight(Double.parseDouble((String) inf.get(SearchCriteria.Oven.WEIGHT.toString())));
					oven.setWight(Double.parseDouble((String) inf.get(SearchCriteria.Oven.WIDTH.toString())));
					appliance.add(oven);
					break;
				case ("Refrigerator"):
					Refrigerator refrigerator = new Refrigerator();
					refrigerator.setName(criteria.getGroupSearchName());
					refrigerator.setPowerConsumption(Integer.parseInt((String) inf.get(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString())));
					refrigerator.setFreezerCapacity(Integer.parseInt((String) inf.get(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString())));
					refrigerator.setHeight(Double.parseDouble((String) inf.get(SearchCriteria.Refrigerator.HEIGHT.toString())));
					refrigerator.setOverallCapacity(Integer.parseInt((String) inf.get(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString())));
					refrigerator.setWeight(Double.parseDouble((String) inf.get(SearchCriteria.Refrigerator.WEIGHT.toString())));
					refrigerator.setWight(Double.parseDouble((String) inf.get(SearchCriteria.Refrigerator.WIDTH.toString())));
					break;
				case ("Speakers"):
					Speakers speakers = new Speakers();
					speakers.setName(criteria.getGroupSearchName());
					speakers.setCordLength(Integer.parseInt((String) inf.get(SearchCriteria.Speakers.CORD_LENGTH.toString())));
					speakers.setNumberOfSpeakers(Integer.parseInt((String) inf.get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString())));
					speakers.setPowerConsumption(Integer.parseInt((String) inf.get(SearchCriteria.Speakers.POWER_CONSUMPTION.toString())));
					speakers.setFrequencyRange((String) inf.get((SearchCriteria.Speakers.FREQUENCY_RANGE.toString())));
					appliance.add(speakers);
					break;
				case ("TabletPC"):
					TabletPC tabletPC = new TabletPC();
					tabletPC.setName(criteria.getGroupSearchName());
					tabletPC.setBatteryCapacity(Integer.parseInt((String) inf.get(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString())));
					tabletPC.setDisplayInches(Integer.parseInt((String) inf.get(SearchCriteria.TabletPC.DISPLAY_INCHES.toString())));
					tabletPC.setMemoryRom(Integer.parseInt((String) inf.get(SearchCriteria.TabletPC.MEMORY_ROM.toString())));
					tabletPC.setFlashMemoryCapacity(Integer.parseInt((String) inf.get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString())));
					tabletPC.setColor((String) inf.get(SearchCriteria.TabletPC.COLOR.toString()));
					appliance.add(tabletPC);
					break;
				case ("VacuumCleaner"):
					VacuumCleaner vacuumCleaner = new VacuumCleaner();
					vacuumCleaner.setName(criteria.getGroupSearchName());
					vacuumCleaner.setBagType((String) inf.get(SearchCriteria.VacuumCleaner.BAG_TYPE.toString()));
					vacuumCleaner.setCleaningWidth(Integer.parseInt((String) inf.get(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString())));
					vacuumCleaner.setFilterType((String) inf.get(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString()));
					vacuumCleaner.setMotorSpeedRegulation(Integer.parseInt((String) inf.get(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString())));
					vacuumCleaner.setPowerConsumption(Integer.parseInt((String) inf.get(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString())));
					vacuumCleaner.setWandType((String) inf.get(SearchCriteria.VacuumCleaner.WAND_TYPE.toString()));
					appliance.add(vacuumCleaner);
					break;
			}
		}

		return appliance;
	}

}