package com.jasokan.jdk8.examples;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author jasokan
 *
 */
public class JTimezoneExample1 {

	public enum OffsetBase {
		GMT, UTC
	}

	public List<String> getTimeZoneList(OffsetBase base) {
		Set<String> jZoneIds = ZoneId.getAvailableZoneIds();

		LocalDateTime now = LocalDateTime.now();
		return jZoneIds.stream().map(ZoneId::of).sorted(new ZoneComparator())
				.map(id -> String.format("(%s%s) %s", base, getOffset(now, id), id.getId()))
				.collect(Collectors.toList());
	}

	private String getOffset(LocalDateTime dateTime, ZoneId id) {
		return dateTime.atZone(id).getOffset().getId().replace("Z", "+00:00");
	}

	private class ZoneComparator implements Comparator<ZoneId> {

		@Override
		public int compare(ZoneId zoneId1, ZoneId zoneId2) {
			LocalDateTime now = LocalDateTime.now();

			ZoneOffset offset1 = now.atZone(zoneId1).getOffset();

			ZoneOffset offset2 = now.atZone(zoneId2).getOffset();

			return offset1.compareTo(offset2);
		}
	}

	public static void main(String... args) {

		JTimezoneExample1 jTExample = new JTimezoneExample1();

		System.out.println("UTC");
		List<String> utc = jTExample.getTimeZoneList(JTimezoneExample1.OffsetBase.UTC);
		utc.forEach(System.out::println);

		System.out.println("GMT");
		List<String> gmt = jTExample.getTimeZoneList(JTimezoneExample1.OffsetBase.GMT);
		gmt.forEach(System.out::println);

	}

}
