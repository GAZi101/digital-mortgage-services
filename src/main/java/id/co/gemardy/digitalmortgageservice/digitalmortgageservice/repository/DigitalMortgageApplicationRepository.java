package id.co.gemardy.digitalmortgageservice.digitalmortgageservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import id.co.gemardy.digitalmortgageservice.digitalmortgageservice.entity.DigitalMortgageApplicationEntity;

@Repository
public interface DigitalMortgageApplicationRepository extends JpaRepository<DigitalMortgageApplicationEntity, String> {
    
    @Query( value = "SELECT * FROM digital_mortgage_application dma WHERE dma.device_id=:deviceId", nativeQuery = true)
    List<DigitalMortgageApplicationEntity> findByDeviceId(String deviceId);
}
