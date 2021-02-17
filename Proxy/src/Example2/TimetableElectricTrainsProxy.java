package Example2;

public class TimetableElectricTrainsProxy implements TimetableTrains {
    // Ссылка на оригинальный объект
    private TimetableTrains timetableTrains = new TimetableElectricTrains();

    private String[] timetableCache = null;

    // Метод getTimetable() проверяет, закэширован ли массив расписания в память.
    // Если нет, он посылает запрос для загрузки данных с диска, сохраняя результат.
    // Если же запрос уже выполняется, он быстро вернет объект из памяти.
    @Override
    public String[] getTimetable() {
        if (timetableCache == null) {
            timetableCache = timetableTrains.getTimetable();
        }

        return timetableCache;
    }

    @Override
    public String getTrainDepartureTime(String trainId) {
        if (timetableCache == null) {
            timetableCache = timetableTrains.getTimetable();
        }

        for(int i = 0; i < timetableCache.length; i++) {
            if(timetableCache[i].startsWith(trainId + ";")) return timetableCache[i];
        }
        return "";
    }

    public void clearCache() {
        timetableTrains = null;
    }
}
