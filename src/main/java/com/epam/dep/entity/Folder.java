package com.epam.dep.entity;

import java.util.Date;

public class Folder {

    private String type;
    private String id;
    private String sequence_id;
    private String etag;
    private String name;
    private Date created_at;
    private Date modified_at;
    private String description;
    private Integer size;
    private PathCollection path_collection;
    private CreatedBy created_by;


    {
        "type": "folder",
            "id": "11446498",
            "sequence_id": "1",
            "etag": "1",
            "name": "Pictures",
            "created_at": "2012-12-12T10:53:43-08:00",
            "modified_at": "2012-12-12T11:15:04-08:00",
            "description": "Some pictures I took",
            "size": 629644,
            "path_collection":
        {
        "total_count": 1,
                "entries": [
        {
 c
        }
        ]
    },
        "created_by": {
        "type": "user",
                "id": "17738362",
                "name": "sean rose",
                "login": "sean@box.com"
    },
        "modified_by": {
        "type": "user",
                "id": "17738362",
                "name": "sean rose",
                "login": "sean@box.com"
    },
        "owned_by": {
        "type": "user",
                "id": "17738362",
                "name": "sean rose",
                "login": "sean@box.com"
    },
        "shared_link": {
        "url": "https://www.box.com/s/vspke7y05sb214wjokpk",
                "download_url": null,
                "vanity_url": null,
                "is_password_enabled": false,
                "unshared_at": null,
                "download_count": 0,
                "preview_count": 0,
                "access": "open",
                "permissions": {
            "can_download": true,
                    "can_preview": true
        }
    },
        "folder_upload_email": {
        "access": "open",
                "email": "upload.Picture.k13sdz1@u.box.com"
    },
        "parent": {
        "type": "folder",
                "id": "0",
                "sequence_id": null,
                "etag": null,
                "name": "All Files"
    },
        "item_status": "active",
            "item_collection": {
        "total_count": 1,
                "entries": [
        {
            "type": "file",
                "id": "5000948880",
                "sequence_id": "3",
                "etag": "3",
                "sha1": "134b65991ed521fcfe4724b7d814ab8ded5185dc",
                "name": "tigers.jpeg"
        }
        ],
        "offset": 0,
                "limit": 100
    },
        "tags": [
        "approved",
                "ready to publish"
    ]
    }
}



class PathCollection {

    private Integer total_count;
    private Entries entries;


    public Integer getTotal_count() {
        return total_count;
    }

    public void setTotal_count(Integer total_count) {
        this.total_count = total_count;
    }

    public Entries getEntries() {
        return entries;
    }

    public void setEntries(Entries entries) {
        this.entries = entries;
    }
}

class CreatedBy {
    private String type;
    private String id;
    private String name;
    private String login;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}


