package handle;

import entity.Figure;
import entity.SummonRift;
import entity.Teams;

import java.util.ArrayList;
import java.util.Scanner;

public class SummonRiftHandle {
    public SummonRift creatSummonRift(Scanner sc){
        TeamsHandle teamsHandle = new TeamsHandle();
        ArrayList<Teams> teams =new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            System.out.println("Nhập thông tin team thứ "  +(i+1) +": ");
            teams.add(teamsHandle.creatTeam(sc));
        }
        return new SummonRift(teams);
    }
}
