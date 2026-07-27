import javafx.fxml.FXML;

public class VehicleOverviewController {

    private VehicleManager vehicleManager;
    private ServiceManager serviceManager;

    @FXML
    public void showView() {
        loadOverviewData();
    }

    public void loadOverviewData() {
        // Load vehicle information from VehicleManager
        // Load service statistics from ServiceManager
    }

    @FXML
    public void returnToDashboard() {
        // Switch back to dashboard
    }
}