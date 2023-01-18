package presenter;

import model.AttendanceService;
import view.AttendanceView;

public class Presenter {
    private AttendanceView view;
    private AttendanceService model;

    public Presenter(AttendanceView view, AttendanceService model) {
        this.view = view;
        this.model = model;
    }
    public void run() {
        view.printList(model.getList());
    }
}