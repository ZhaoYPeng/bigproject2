package com.zyp.action;

import com.zyp.dto.EIDataGridDTO;
import com.zyp.dto.EITreeDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EuiBirthAction {
    @RequestMapping("/euibirth")
    public String euiBirth(){
        return "easyuitest";
    }

    @RequestMapping("/datagrid_data.json")
    @ResponseBody
    public List<EIDataGridDTO> dataGrid(){
        List<EIDataGridDTO> lists=new ArrayList<>();
        lists.add(new EIDataGridDTO("1001","iphone",6688D));
        lists.add(new EIDataGridDTO("1002","mi",2000D));
        lists.add(new EIDataGridDTO("1003","huawei",1999D));
        return lists;
    }
    @RequestMapping("/tree_data.json")
    @ResponseBody
    public List<EITreeDTO> treeDate(){
        ArrayList<EITreeDTO> children = new ArrayList<>();
        children.add(new EITreeDTO(11,"node11"));
        children.add(new EITreeDTO(12,"node12"));

        ArrayList<EITreeDTO> eiTreeDTOS = new ArrayList<>();
        eiTreeDTOS.add(new EITreeDTO(1,"node1","closed",children));
        eiTreeDTOS.add(new EITreeDTO(2,"node2"));

        return eiTreeDTOS;
    }
}
