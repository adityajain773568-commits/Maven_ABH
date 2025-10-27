package com.scaleupindia.respository;

import com.scaleupindia.dto.OwnerDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface OwnerRepository {
    void saveOwner(OwnerDTO ownerDTO) throws ClassNotFoundException;

    OwnerDTO findOwner(int ownerId);

    void updatePetDetails(int ownerId , String petName);

    void deleteOwner(int ownerId);

    List<OwnerDTO> findAllOwners();

    List<OwnerDTO> updatePetDetails(String petType);

}
