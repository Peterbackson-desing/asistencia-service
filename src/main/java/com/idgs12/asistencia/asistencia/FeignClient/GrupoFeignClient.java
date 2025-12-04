package com.idgs12.asistencia.asistencia.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.idgs12.asistencia.asistencia.dto.GrupoDTO;

@FeignClient(name = "grupos", url = "https://grupos-repository-production.up.railway.app")
public interface GrupoFeignClient {

    @GetMapping("/grupos/usuario/{usuarioId}")
    GrupoDTO getGrupoPorUsuario(@PathVariable("usuarioId") Long usuarioId);
}
