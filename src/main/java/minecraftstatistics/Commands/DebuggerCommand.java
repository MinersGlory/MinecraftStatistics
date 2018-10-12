package minecraftstatistics.Commands;

import minecraftstatistics.Main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class DebuggerCommand implements CommandExecutor {

    protected Main plugin;

    public DebuggerCommand(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(!commandSender.hasPermission("minecraftstatistics.debug")){
            commandSender.sendMessage(ChatColor.RED + "You don't have access to this command");
            return true;
        }

        commandSender.sendMessage(ChatColor.LIGHT_PURPLE + "Debug command executed. Outputting your data: ");
        // Do debug stuff below

        return true;
    }

}

