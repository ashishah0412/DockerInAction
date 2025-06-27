
# 🐳 Docker Command Reference Guide

This document outlines common Docker commands, their purposes, and important flags. Each command includes a description, frequently used flags, and example usages.

---

## 📋 Docker Command Overview Table

| Command         | Description |
|----------------|-------------|
| `docker images` | List all locally stored Docker images. |
| `docker pull`   | Pull an image from a registry (like Docker Hub or GitHub Container Registry). |
| `docker run`    | Run a command in a new container. |
| `docker ps`     | List running containers. |
| `docker exec`   | Run a command inside a running container. |
| `docker start`  | Start one or more stopped containers. |
| `docker stop`   | Stop one or more running containers. |
| `docker rm`     | Remove one or more containers. |
| `docker rmi`    | Remove one or more images. |

---

## 🛠️ Command Details, Flags & Examples

### `docker images`
| Flag         | Description |
|--------------|-------------|
| `-a`, `--all`| Show all images including intermediate. |
| `--digests`  | Show image digests. |
| `--format`   | Format output using Go template. |
| `--no-trunc` | Don’t truncate output. |
| `-q`, `--quiet` | Only show numeric IDs. |

**Examples:**
```bash
docker images
docker images -a
docker images --format "{{.Repository}}:{{.Tag}}"
```

---

### `docker pull`
| Flag              | Description |
|-------------------|-------------|
| `-a`, `--all-tags`| Download all tagged images in the repository. |
| `--platform`      | Set platform if multi-platform image. |

**Examples:**
```bash
docker pull nginx
docker pull -a nginx
docker pull ghcr.io/OWNER/REPO:tag
```

---

### `docker run`
| Flag              | Description |
|-------------------|-------------|
| `-d`, `--detach`  | Run in background. |
| `-p`, `--publish` | Map container port to host port. |
| `--name`          | Assign a name to the container. |
| `-v`, `--volume`  | Mount host volume. |
| `-e`, `--env`     | Set environment variables. |
| `--rm`            | Auto remove on exit. |
| `-it`             | Interactive with TTY. |

**Examples:**
```bash
docker run -it ubuntu bash
docker run -d -p 8080:80 --name webserver nginx
docker run --rm hello-world
```

---

### `docker ps`
| Flag         | Description |
|--------------|-------------|
| `-a`         | Show all containers. |
| `-q`         | Only display numeric IDs. |
| `--no-trunc` | Don’t truncate output. |
| `--format`   | Format using Go template. |

**Examples:**
```bash
docker ps
docker ps -a
docker ps -q
```

---

### `docker exec`
| Flag            | Description |
|-----------------|-------------|
| `-d`            | Run in background. |
| `-i`            | Keep STDIN open. |
| `-t`            | Allocate pseudo-TTY. |

**Examples:**
```bash
docker exec -it mycontainer bash
docker exec mycontainer ls -l /app
```

---

### `docker start`
| Flag         | Description |
|--------------|-------------|
| `-a`         | Attach and display output. |
| `-i`         | Attach container’s STDIN. |

**Examples:**
```bash
docker start mycontainer
docker start -ai mycontainer
```

---

### `docker stop`
| Flag         | Description |
|--------------|-------------|
| `-t`         | Timeout before killing container. |

**Examples:**
```bash
docker stop mycontainer
docker stop -t 5 mycontainer
```

---

### `docker rm`
| Flag         | Description |
|--------------|-------------|
| `-f`         | Force removal. |
| `-v`         | Remove attached volumes. |
| `--link`     | Remove a specific link. |

**Examples:**
```bash
docker rm mycontainer
docker rm -f mycontainer
docker rm -v $(docker ps -aq)
```

---

### `docker rmi`
| Flag         | Description |
|--------------|-------------|
| `-f`         | Force removal. |
| `--no-prune` | Skip pruning untagged parents. |

**Examples:**
```bash
docker rmi image_id
docker rmi -f $(docker images -q)
```

---

## ✅ Common Command Combos

| Command Example | Purpose |
|------------------|---------|
| `docker run -it ubuntu bash` | Interactive Ubuntu shell. |
| `docker run -d -p 8080:80 nginx` | Detached NGINX with port mapping. |
| `docker ps -aq` | List all container IDs. |
| `docker rm -f $(docker ps -aq)` | Force remove all containers. |
| `docker rmi $(docker images -q)` | Remove all images. |

---

## 🔗 Linking This File from `README.md`

To link this file in your `README.md`:

```markdown
[Docker Command Reference Guide](./docker_networking_commands_reference.md)
```

Place both `README.md` and this file in the same directory or adjust the path accordingly.
