package se.lexicon.g46todoapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.lexicon.g46todoapi.converter.RoleConverter;
import se.lexicon.g46todoapi.domain.dto.RoleDTOForm;
import se.lexicon.g46todoapi.domain.dto.RoleDTOView;
import se.lexicon.g46todoapi.domain.entity.Role;
import se.lexicon.g46todoapi.repository.RoleRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

  private final RoleRepository roleRepository;
  private final RoleConverter roleConverter;

  @Autowired
  public RoleServiceImpl(RoleRepository roleRepository, RoleConverter roleConverter) {
    this.roleRepository = roleRepository;
    this.roleConverter = roleConverter;
  }

  @Override
  public List<RoleDTOView> getAll() {
    List<Role> roles = roleRepository.findAll();
    List<RoleDTOView> roleDTOList = new ArrayList<>();
    for (Role entity : roles) {
      roleDTOList.add(roleConverter.toRoleDTOView(entity));
    }
    return roleDTOList;
  }

  @Override
  public RoleDTOView findById(Integer roleId) {
    return null;
  }

  @Override
  public RoleDTOView create(RoleDTOForm roleDto) {
    return null;
  }

  @Override
  public void update(RoleDTOForm roleDto) {

  }

  @Override
  public void delete(Integer roleId) {

  }

}
