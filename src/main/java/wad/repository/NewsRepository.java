/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wad.domain.News;
/**
 *
 * @author Jaakko
 */
public interface NewsRepository extends JpaRepository<News, Long>{
    
}
