package se.lexicon.g46todoapi.service;

import se.lexicon.g46todoapi.domain.dto.RoleDTOForm;
import se.lexicon.g46todoapi.domain.dto.RoleDTOView;

import java.util.List;


public interface RoleService {

  List<RoleDTOView> getAll();

  RoleDTOView findById(Integer roleId);

  RoleDTOView create(RoleDTOForm roleDto);

  void update(RoleDTOForm roleDto);

  void delete(Integer roleId);


}
