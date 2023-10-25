package Weather.Application.service.implementations;

import Weather.Application.entity.Location;
import Weather.Application.entity.Viewer;
import Weather.Application.repository.LocationRepository;
import Weather.Application.repository.ViewerRepository;
import Weather.Application.service.interfaces.ViewerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViewerServiceImpl implements ViewerService {

    @Autowired
    private ViewerRepository viewerRepository;

    @Override
    public Viewer addViewer(Viewer viewer) {
        return viewerRepository.save(viewer);
    }
}
