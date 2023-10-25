package Weather.Application.controller;
import Weather.Application.entity.Viewer;
import Weather.Application.service.implementations.ViewerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewerControllerImpl {

    @Autowired
    private ViewerServiceImpl viewerService;
    @PostMapping("/viewer/add")
    public ResponseEntity<String> addViewer(@RequestBody Viewer viewer) {
        try {
            Viewer savedViewer = viewerService.addViewer(viewer);
            String message = "Viewer added successfully!";
            return ResponseEntity.status(HttpStatus.OK).body(message);
        } catch (Exception e) {
            String errorMessage = "Failed to add viewer: " + e.getMessage();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessage);
        }
    }
}
