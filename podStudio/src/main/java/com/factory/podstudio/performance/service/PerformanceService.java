package com.factory.podstudio.performance.service;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import com.factory.podstudio.performance.model.Performance;


@Service
public class PerformanceService {
	Date date = new Date();
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
	private final String URL = "http://api.visitkorea.or.kr/openapi/service/rest/KorService/searchFestival?";
	private final String SERVICE_KEY = "vax74GE9b%2BbJpNiUAQm%2FbJOQ2ugJ4Nm1ll3VDKKvYsnvsr2Cfe9q%2F9xC3xrkCg5lxc9aWqKm8lYYS75zMx9LaQ%3D%3D";
	private int numOfRows = 1000;
	private int pageNo = 1;
	private String arrange = "A";
	private String listYN = "Y";
	private int eventStartDate = Integer.parseInt(simpleDateFormat.format(date));
	private String MobileOs = "ETC";
	private final String MOBILE_APP = "공연정보";

	public List<Performance> listPerformance(int pageSize, int startPage) {

		String urlString = URL;
		urlString += "ServiceKey=" + SERVICE_KEY;
		urlString += "&numOfRows=" + numOfRows;
		urlString += "&pageNo=" + pageNo;
		urlString += "&arrange=" + arrange;
		urlString += "&listYN=" + listYN;
		urlString += "&eventStartDate=" + eventStartDate;
		urlString += "&MobileOS=" + MobileOs;
		urlString += "&MobileApp=" + MOBILE_APP;
		List<Performance> list = null;
		System.out.println("urlString PerformanceService : " + urlString);
		try {
			URL url;
			url = new URL(urlString + (pageSize != 0 ? "&pageSize=" + pageSize : "")
					+ (startPage != 0 ? "&startPage=" + startPage : ""));
			URLConnection urlConnection = url.openConnection();
			System.out.println("url : " + url);
			XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
			XmlPullParser parser = factory.newPullParser();
			parser.setInput(new InputStreamReader(urlConnection.getInputStream()));

			int eventType = parser.getEventType();
			Performance Performance = null;
			while (eventType != XmlPullParser.END_DOCUMENT) {
				switch (eventType) {
				case XmlPullParser.END_DOCUMENT:
					break;
				case XmlPullParser.START_DOCUMENT:
					list = new ArrayList<Performance>();
					break;
				case XmlPullParser.END_TAG: {
					String tag = parser.getName();
					if (tag.equals("item")) {
						list.add(Performance);
						Performance = null;
					}
				}
				case XmlPullParser.START_TAG: {
					String tag = parser.getName();
					switch (tag) {
					case "item":
						Performance = new Performance();
						break;
					case "addr1":
						if (Performance != null) {
							Performance.setAddr1(parser.nextText());
						}
						break;
					case "addr2":
						if (Performance != null) {
							Performance.setAddr2(parser.nextText());
						}
						break;
					case "areacode":
						if (Performance != null) {
							Performance.setAreacode(parser.nextText());
						}
						break;
					case "cat1":
						if (Performance != null) {
							Performance.setCat1(parser.nextText());
						}
						break;
					case "cat2":
						if (Performance != null) {
							Performance.setCat2(parser.nextText());
						}
						break;
					case "cat3":
						if (Performance != null) {
							Performance.setCat3(parser.nextText());
						}
						break;
					case "contentid":
						if (Performance != null) {
							Performance.setContentid(parser.nextText());
						}
						break;
					case "contenttypeid":
						if (Performance != null) {
							Performance.setContenttypeid(parser.nextText());
						}
						break;
					case "createdtime":
						if (Performance != null) {
							Performance.setCreatedtime(parser.nextText());
						}
						break;
					case "eventenddate":
						if (Performance != null) {
							Performance.setEventenddate(parser.nextText());
						}
						break;
					case "eventstartdate":
						if (Performance != null) {
							Performance.setEventstartdate(parser.nextText());
						}
						break;
					case "mapx":
						if (Performance != null) {
							Performance.setMapx(parser.nextText());
						}
						break;
					case "mapy":
						if (Performance != null) {
							Performance.setMapy(parser.nextText());
						}
						break;
					case "modifiedtime":
						if (Performance != null) {
							Performance.setModifiedtime(parser.nextText());
						}
						break;
					case "readcount":
						if (Performance != null) {
							Performance.setReadcount(parser.nextText());
						}
						break;
					case "sigungucode":
						if (Performance != null) {
							Performance.setSigungucode(parser.nextText());
						}
						break;
					case "tel":
						if (Performance != null) {
							Performance.setTel(parser.nextText());
						}
						break;
					case "title":
						if (Performance != null) {
							Performance.setTitle(parser.nextText());
						}
						break;
					}
				}
				}
				eventType = parser.next();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (XmlPullParserException e) {
			e.printStackTrace();
		}
		return list;
	}
}
